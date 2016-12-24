package parser;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoException;
import databases.ConnectDB;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProcessStudentInfo {

    /*
     * Under XmlReader class, the parseData() will return list of Student Info which will contain Student first name, last name and score.
     * You need to implement the method name "convertIntToChar()" which will convert String score into char Grade.('A'for 90 to 100,'B'for 80 to 89 and
     * 'C' for 70 to 79.
     *
     * Here in the main method fill in the code that outlined to read xml data parsed into 2 separate ArrayList, then store into map.
     * Once map has all data, retrieve those data and out put to console.
     *
     * Do any necessary steps that require for below successful output.
     * .................................................
     * Student (id= 1) "Mukbula" "Constructor" Grade= B
     * Student (id= 2) "Izran" "Khan"          Grade= A
     * Student (id= 3) "Karina" "Rashid"       Grade= A
     * Student (id= 4) "MD" "Hossain"          Grade= B
     * Student (id= 5) "Hemel" "Kabir"         Grade= C
     * .................................................
     *
     *
     * Use any databases[MongoDB, Oracle, MySql] to store data and to retrieve data.
     *
     */
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        //Path of XML data to be read.
        String pathSelenium = System.getProperty("user.dir") + "/src/parser/selenium.xml";
        String pathQtp = System.getProperty("user.dir") + "/src/parser/qtp.xml";
        String tag = "id";

        //Declare a Map with List<String> into it.

        List<String> map = new ArrayList<String>();

				/*Declare 2 ArrayList with Student data type to store Selenium student into one of the ArrayList and
				  Qtp student into another ArrayList. */

        List<Student> qtpList = new ArrayList<Student>();
        List<Student> seleniumList = new ArrayList<Student>();

        //Create XMLReader object.

        XmlReader xmlReader = new XmlReader();

        //Parse Data using parseData method and then store data into Selenium ArrayList.

        seleniumList = xmlReader.parseData(tag, pathSelenium);

        //Parse Data using parseData method and then store data into Qtp ArrayList.

        qtpList = xmlReader.parseData(tag, pathQtp);

        //add Selenium ArrayList data into map.
        for (Student st : seleniumList) {
            map.add("Student (id= " + st.id + ") " + st.firstName + " " + st.lastName + " Grade= " + st.score);
        }

        //add Qtp ArrayList data into map.
        for (Student st : qtpList) {
            map.add("Student (id= " + st.id + ") " + st.firstName + " " + st.lastName + " Grade= " + st.score);
        }

        //Retrieve map data and display output.

        map.forEach(System.out::println);


        ConnectDB connectDB = new ConnectDB();
        ConnectDB.connectMongoDB2();
        ResultSet rs = null;
        try {
            connectDB.directDatabaseQueryExecute("delete from tbl_ProcessStudentInfo");
            for (Student st : seleniumList) {
                String sql = "INSERT INTO `core_java`.`tbl_ProcessStudentInfo` (`studentid`, `firstname`, `lastname`, `grade`)";
                sql = sql + " VALUES("+st.id+",'" + st.firstName + "','" + st.lastName + "','" + st.score + "')";

                connectDB.directDatabaseQueryExecute(sql);
            }
            for (Student st : qtpList) {
                String sql = "INSERT INTO `core_java`.`tbl_ProcessStudentInfo` (`studentid`, `firstname`, `lastname`, `grade`)";
                sql = sql + " VALUES("+st.id+",'" + st.firstName + "','" + st.lastName + "','" + st.score + "')";

                connectDB.directDatabaseQueryExecute(sql);
            }
            System.out.println("\n\nData is reading from the Table (tbl_ProcessStudentInfo) and displaying to the console\n");
            rs = connectDB.Query("select * from tbl_ProcessStudentInfo");
            while (rs.next()) {
                System.out.println("Student (id= " + rs.getString("studentid") + ") " + rs.getString("firstname") + " " + rs.getString("lastname") + " Grade= " + rs.getString("grade"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

		/*Mongodb section start*/
        DBCursor cursor = null;
        try {
            ConnectDB.removeMongoDBDataDocument("tbl_ProcessStudentInfo");
            for (Student st : seleniumList) {
                BasicDBObject doc = new BasicDBObject();
                doc.put("studentid", st.id);
                doc.put("firstname", st.firstName);
                doc.put("lastName", st.lastName);
                doc.put("score", st.score);
                ConnectDB.insertMongoDBDataDocument("tbl_ProcessStudentInfo", doc);
            }
            for (Student st : qtpList) {
                BasicDBObject doc = new BasicDBObject();
                doc.put("studentid", st.id);
                doc.put("firstname", st.firstName);
                doc.put("lastname", st.lastName);
                doc.put("score", st.score);
                ConnectDB.insertMongoDBDataDocument("tbl_ProcessStudentInfo", doc);
            }

            System.out.println("\n\nData is reading from the MongoDB collection (tbl_ProcessStudentInfo) and displaying to the console\n");
            cursor = ConnectDB.getMongoDBDataDocument("tbl_ProcessStudentInfo");
            while (cursor.hasNext()) {
                DBObject obj = cursor.next();
                String studentid = (String) obj.get("studentid");
                String firstName = (String) obj.get("firstname");
                String lastName = (String) obj.get("lastname");
                String grade = (String) obj.get("score");

                System.out.println("Student (id= " + studentid + ") " + firstName+ " " + lastName + " Grade= " + grade);
            }
        } catch (MongoException e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor = null;
            }
        }
		/*Mongodb section end*/
    }

}

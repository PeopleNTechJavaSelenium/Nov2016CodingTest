package parser;

import databases.ConnectDB;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
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

			ConnectDB connectDB = new ConnectDB();
			//Path of XML data to be read.
			String pathSelenium  = System.getProperty("user.dir") +"/src/parser/selenium.xml";
			String pathQtp = System.getProperty("user.dir") + "/src/parser/qtp.xml";
			String tag = "id";

			//Declare a Map with List<String> into it.

			List<String> map = new ArrayList<>();

				/*Declare 2 ArrayList with Student data type to store Selenium student into one of the ArrayList and
				  Qtp student into another ArrayList. */

			List<Student> qtpList = new ArrayList<>();
			List<Student> seleniumList = new ArrayList<>();

			//Create XMLReader object.

			XmlReader xmlReader = new XmlReader();

			//Parse Data using parseData method and then store data into Selenium ArrayList.
			seleniumList = xmlReader.parseData(tag, pathSelenium);

			//Parse Data using parseData method and then store data into Qtp ArrayList.
			qtpList = xmlReader.parseData(tag, pathQtp);

			//add Selenium ArrayList data into map.
			for (Student st: seleniumList){
				map.add(st.toString());
				connectDB.InsertDataFromStringToMySqlFourCol("ParserSeleniumData",st.id,"StudentID",st.firstName,"StudentFName",st.lastName,"StudentLName",st.score,"StudentGrade");
			}
			//add Qtp ArrayList data into map.
			for (Student st: qtpList){
				map.add(st.toString());
				connectDB.InsertDataFromStringToMySqlFourCol("ParserQTPData",st.id,"StudentID",st.firstName,"StudentFName",st.lastName,"StudentLName",st.score,"StudentGrade");
			}


			//Retrieve map data and display output.

			map.forEach(System.out::println);

			System.out.println("Read from DB");
			try {
				System.out.println("Reading First Name to verify only");
				System.out.println(connectDB.readDataBase("ParserSeleniumData","StudentFName"));
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

}
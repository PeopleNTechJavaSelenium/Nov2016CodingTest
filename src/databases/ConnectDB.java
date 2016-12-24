package databases;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;



/**
 * Created by mrahman on 12/18/16.
 */


public class ConnectDB {

    //public static MongoDatabase mongoDatabase = null;

    public static MongoDatabase mongoDatabase=null;
    Connection connect = null;
    Statement statement = null;
    PreparedStatement ps = null;
    ResultSet resultSet = null;

    public static Properties loadProperties() throws IOException{
        Properties prop = new Properties();
        InputStream ism = new FileInputStream("src/MySql.properties");
        prop.load(ism);
        ism.close();
        return prop;
    }


    public void connectToDatabase() throws IOException, SQLException, ClassNotFoundException {
        Properties prop = loadProperties();
        String driverClass = prop.getProperty("MYSQLJDBC.driver");
        String url = prop.getProperty("MYSQLJDBC.url");
        String userName = prop.getProperty("MYSQLJDBC.userName");
        String password = prop.getProperty("MYSQLJDBC.password");
        Class.forName(driverClass);
        connect = DriverManager.getConnection(url,userName,password);
        //  System.out.println("Database is connected");

    }



   public static MongoDatabase connectMongoDB() {

 //   public static DB connectMongoDB() {

        String host = "localhost";
        MongoClientURI mongoClientURI = new MongoClientURI(host);
        MongoClient mongoClient = new MongoClient(mongoClientURI);
        System.out.println("MongoDB Connection Eastablished");
        mongoDatabase = mongoClient.getDatabase("database_name");
        System.out.println("Database Connected");

        return mongoDatabase;
    }


    public List<String> readDataBase(String tableName, String columnName)throws Exception{
        List<String> data = new ArrayList<String>();

        try {
            connectToDatabase();
            statement = connect.createStatement();
            resultSet = statement.executeQuery("select * from " + tableName);
            data = getResultSetData(resultSet, columnName);
        } catch (ClassNotFoundException e) {
            throw e;
        }finally{
            close();
        }
        return data;
    }





    private void close() {
        try{
            if(resultSet != null){
                resultSet.close();
            }
            if(statement != null){
                statement.close();
            }
            if(connect != null){
                connect.close();
            }
        }catch(Exception e){

        }
    }


    private List<String> getResultSetData(ResultSet resultSet2, String columnName) throws SQLException {
        List<String> dataList = new ArrayList<String>();
        while(resultSet.next()){
            String itemName = resultSet.getString(columnName);
            dataList.add(itemName);
        }
        return dataList;
    }

    // function  for Data insert into MySQL Database
    public void InsertDataFromArryToMySql(int [] ArrayData,String tableName, String columnName)
    //InsertDataFromArryListToMySql

    //  public void InsertDataFromArryToMySql()
    {

        try {
            connectToDatabase();

            //  connect.createStatement("INSERT into tbl_insertionSort set SortingNumbers=1000");

            for(int n=0; n<ArrayData.length; n++){

                ps = connect.prepareStatement("INSERT INTO "+tableName+" ( "+columnName+" ) VALUES(?)");
                ps.setInt(1,ArrayData[n]);
                ps.executeUpdate();
                //System.out.println(list[n]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //connection = ConnectionConfiguration.getConnection();
    }


    // Function for Insert Single value in a table

    public void InsertDataFromStringToMySql(String ArrayData,String tableName, String columnName)


    //  public void InsertDataFromArryToMySql()
    {

        try {
            connectToDatabase();

            //  connect.createStatement("INSERT into tbl_insertionSort set SortingNumbers=1000");


            ps = connect.prepareStatement("INSERT INTO "+tableName+" ( "+columnName+" ) VALUES(?)");
            ps.setString(1,ArrayData);
            ps.executeUpdate();
            //System.out.println(list[n]);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //connection = ConnectionConfiguration.getConnection();
    }

    public void InsertDataFromStringToMySqlThreeCol(String tableName, String ArrayData1, String columnName1, String ArrayData2, String columnName2, String ArrayData3, String columnName3)


    //  public void InsertDataFromArryToMySql()
    {

        try {
            connectToDatabase();

            //  connect.createStatement("INSERT into tbl_insertionSort set SortingNumbers=1000");


            ps = connect.prepareStatement("INSERT INTO "+tableName+" ( "+columnName1+","+columnName2+","+columnName3+" ) VALUES(?,?,?)");
            ps.setString(1,ArrayData1);
            ps.setString(2,ArrayData2);
            ps.setString(3,ArrayData3);
            ps.executeUpdate();
            //System.out.println(list[n]);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //connection = ConnectionConfiguration.getConnection();
    }

    public void InsertDataFromStringToMySqlTwoCol(String tableName, String ArrayData1, String columnName1, String ArrayData2, String columnName2)

    {

        try {
            connectToDatabase();

            ps = connect.prepareStatement("INSERT INTO "+tableName+" ( "+columnName1+","+columnName2+" ) VALUES(?,?)");
            ps.setString(1,ArrayData1);
            ps.setString(2,ArrayData2);
            ps.executeUpdate();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void InsertDataFromStringToMySqlFourCol(String tableName, String ArrayData1, String columnName1, String ArrayData2, String columnName2, String ArrayData3, String columnName3, String ArrayData4, String columnName4)


    {

        try {
            connectToDatabase();



            ps = connect.prepareStatement("INSERT INTO "+tableName+" ( "+columnName1+","+columnName2+","+columnName3+","+columnName4+" ) VALUES(?,?,?,?)");
            ps.setString(1,ArrayData1);
            ps.setString(2,ArrayData2);
            ps.setString(3,ArrayData3);
            ps.setString(4,ArrayData4);
            ps.executeUpdate();
            //System.out.println(list[n]);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void InsertDataFromStringToMySqlSixCol(String tableName, String ArrayData1, String columnName1, String ArrayData2, String columnName2, String ArrayData3, String columnName3, String ArrayData4, String columnName4, String ArrayData5, String columnName5, String ArrayData6, String columnName6)


    {

        try {
            connectToDatabase();



            ps = connect.prepareStatement("INSERT INTO "+tableName+" ( "+columnName1+","+columnName2+","+columnName3+","+columnName4+","+columnName5+","+columnName6+" ) VALUES(?,?,?,?,?,?)");
            ps.setString(1,ArrayData1);
            ps.setString(2,ArrayData2);
            ps.setString(3,ArrayData3);
            ps.setString(4,ArrayData4);
            ps.setString(5,ArrayData5);
            ps.setString(6,ArrayData6);
            ps.executeUpdate();
            //System.out.println(list[n]);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public List<String> directDatabaseQueryExecute(String passQuery,String dataColumn)throws Exception{
        List<String> data = new ArrayList<String>();

        try {
            connectToDatabase();
            statement = connect.createStatement();
            resultSet = statement.executeQuery(passQuery);
            data = getResultSetData(resultSet, dataColumn);
        } catch (ClassNotFoundException e) {
            throw e;
        }finally{
            close();
        }
        return data;
    }


//

    public void InsertDataFromArryListToMySql(List<Integer> list,String tableName, String columnName)
    //InsertDataFromArryListToMySql

    //  public void InsertDataFromArryToMySql()
    {

        try {
            connectToDatabase();

            //  connect.createStatement("INSERT into tbl_insertionSort set SortingNumbers=1000");

            for(Object st:list){
                // System.out.println(st);

                ps = connect.prepareStatement("INSERT INTO "+tableName+" ( "+columnName+" ) VALUES(?)");
                ps.setObject(1,st);
                ps.executeUpdate();
                //System.out.println(list[n]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //connection = ConnectionConfiguration.getConnection();
    }

}
package databases;

import com.mongodb.*;
//import com.mongodb.client.MongoDatabase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;



/**
 * Created by mrahman on 12/18/16.
 */


public class ConnectDB {

    //public static MongoDatabase mongoDatabase = null;
    public static DB mongodb = null;

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



    public static void connectMongoDB() {

        String host = "mongodb://localhost";
        MongoClientURI mongoClientURI = new MongoClientURI(host);
        //MongoClient mongoClient = new MongoClient(mongoClientURI);
        System.out.println("MongoDB Connection Eastablished");
        //mongoDatabase = mongoClient.getDatabase("database_name");
        System.out.println("Database Connected");

    }

    public static void connectMongoDB2() {
        try {
            MongoClient mongo = new MongoClient("localhost", 27017);
            mongodb = mongo.getDB("core_java");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void insertMongoDBDataDocument(String collectionName, BasicDBObject documentMap ) {
        try {
            DBCollection collection = mongodb.getCollection(collectionName);
            collection.insert(documentMap);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public static void removeMongoDBDataDocument(String collectionName ) {
        try {
            DBCollection collection = mongodb.getCollection(collectionName);
            collection.remove(new BasicDBObject());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public static DBCursor getMongoDBDataDocument(String collectionName ) {
        DBCursor cursor = null;
        try {
            DBCollection collection = mongodb.getCollection(collectionName);
            cursor = collection.find();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return cursor;
    }

    public ResultSet Query(String sql)  throws SQLException{
        Statement stmt = null;
        ResultSet resultSet = null;
        try{
            connectToDatabase();
            stmt = connect.createStatement();
            resultSet = stmt.executeQuery(sql);
        }catch(Exception e){
            e.printStackTrace();
        }

        return resultSet;
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
    public void InsertDataFromArryToMySqlNew(String[][] ArrayData,String tableName, String columnName) {
        try {
            connectToDatabase();

            //  connect.createStatement("INSERT into tbl_insertionSort set SortingNumbers=1000");
            StringBuilder cName = new StringBuilder();
            StringBuilder cValue = new StringBuilder();
            for (int n = 0; n < ArrayData.length; n++) {
                if (cName.length() > 0) {
                    cName.append(",");
                    cValue.append(",");
                }
                cName.append(ArrayData[n][0]);
                cValue.append("?");
            }
            System.out.println("INSERT INTO " + tableName + " ( " + cName.toString() + " ) VALUES(" + cValue.toString() + ")");

            ps = connect.prepareStatement("INSERT INTO " + tableName + " ( " + cName.toString() + " ) VALUES(" + cValue.toString() + ")");
            for (int n = 0; n < ArrayData.length; n++) {
                ps.setString(n + 1, ArrayData[0][n]);
            }
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

    public void directDatabaseQueryExecute(String passQuery)throws Exception{
        try {
            connectToDatabase();
            statement = connect.createStatement();
            statement.executeUpdate(passQuery);
        } catch (ClassNotFoundException e) {
            throw e;
        }finally{
            close();
        }

    }
//

    public void InsertDataFromArryListToMySql(List<Object> list,String tableName, String columnName)
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
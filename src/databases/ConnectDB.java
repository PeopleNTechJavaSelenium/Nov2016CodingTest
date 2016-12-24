package databases;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;




public class ConnectDB {
    private static MongoDatabase mongoDatabase = null;
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement ps = null;
    private ResultSet resultSet = null;

    public ConnectDB() {
    }

    public static Properties loadProperties() throws IOException{
        Properties prop = new Properties();
        FileInputStream ism = new FileInputStream("src/MySql.properties");
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
        this.connect = DriverManager.getConnection(url, userName, password);
    }

    public static MongoDatabase connectMongoDB() {
        String host = "localhost";
        MongoClientURI mongoClientURI = new MongoClientURI(host);
        MongoClient mongoClient = new MongoClient(mongoClientURI);
        System.out.println("MongoDB Connection Eastablished");
        mongoDatabase = mongoClient.getDatabase("database_name");
        System.out.println("Database Connected");
        return mongoDatabase;
    }

    public List readDataBase(String tableName, String columnName) throws Exception {
        new ArrayList();

        List data;
        try {
            this.connectToDatabase();
            this.statement = this.connect.createStatement();
            this.resultSet = this.statement.executeQuery("select * from " + tableName);
            data = this.getResultSetData(this.resultSet, columnName);
        } catch (ClassNotFoundException e) {
            throw e;
        } finally {
            this.close();
        }

        return data;
    }

    private void close() {
        try {
            if(this.resultSet != null){
                this.resultSet.close();
            }

            if(this.statement != null){
                this.statement.close();
            }

            if(this.connect != null){
                this.connect.close();
            }
        } catch (Exception ignored){
            ;
        }
    }

    private List<String> getResultSetData(ResultSet resultSet2, String columnName) throws SQLException {
        ArrayList dataList = new ArrayList();

        while(this.resultSet.next()) {
            String itemName = this.resultSet.getString(columnName);
            dataList.add(itemName);
        }

        return dataList;
    }

    public void InsertDataFromArryToMySql(int[] ArrayData, String tableName, String columnName) {
        try {
            this.connectToDatabase();

            for(int i = 0; i < ArrayData.length; ++i) {
                this.ps = this.connect.prepareStatement("INSERT INTO " + tableName + " ( " + columnName + " ) VALUES(?)");
                this.ps.setInt(1, ArrayData[i]);
                this.ps.executeUpdate();
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (SQLException e2) {
            e2.printStackTrace();
        } catch (ClassNotFoundException e3) {
            e3.printStackTrace();
        }

    }

    public void InsertDataFromStringToMySql(String ArrayData, String tableName, String columnName) {
        try {
            this.connectToDatabase();
            this.ps = this.connect.prepareStatement("INSERT INTO " + tableName + " ( " + columnName + " ) VALUES(?)");
            this.ps.setString(1, ArrayData);
            this.ps.executeUpdate();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (SQLException e2) {
            e2.printStackTrace();
        } catch (ClassNotFoundException e3) {
            e3.printStackTrace();
        }

    }

    public List directDatabaseQueryExecute(String passQuery, String dataColumn) throws Exception {
        new ArrayList();

        List data;
        try {
            this.connectToDatabase();
            this.statement = this.connect.createStatement();
            this.resultSet = this.statement.executeQuery(passQuery);
            data = this.getResultSetData(this.resultSet, dataColumn);
        } catch (ClassNotFoundException e4) {
            throw e4;
        } finally {
            this.close();
        }

        return data;
    }

    public void InsertDataFromArryListToMySql(List<Object> list, String tableName, String columnName) {
        try {
            this.connectToDatabase();
            Iterator e = list.iterator();

            while(e.hasNext()){
                Object st = e.next();
                this.ps = this.connect.prepareStatement("INSERT INTO " + tableName + " ( " + columnName + " ) VALUES(?)");
                this.ps.setObject(1, st);
                this.ps.executeUpdate();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (SQLException e3) {
            e3.printStackTrace();
        } catch (ClassNotFoundException e4) {
            e4.printStackTrace();
        }

    }
}
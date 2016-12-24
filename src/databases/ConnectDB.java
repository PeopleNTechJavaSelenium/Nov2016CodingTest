package databases;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import com.mysql.jdbc.*;


/**
 * Created by mrahman on 12/18/16.
 */


public class ConnectDB {

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
        Connection connect = DriverManager.getConnection(url,userName,password);
        System.out.println("Database is connected");
        connect.close();

    }

    public List<String> readDataBase(String tableName, String columnName)throws Exception{
        List<String> data = new ArrayList<String>();

        try {
            connectToDatabase();
            /*
            com.mysql.jdbc.Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from " + tableName);
            data = getResultSetData(resultSet, columnName);
            */
        } catch (ClassNotFoundException e) {
            throw e;
        }finally{
            close();
        }
        return data;
    }


    private void close() {
        /*
        try{
            //if(resultSet != null){
            //    resultSet.close();
            //}
            if(statement != null){
                statement.close();
            }
            if(connect != null){
                connect.close();
            }
        }catch(Exception e){

        }
        */
    }


    private List<String> getResultSetData(ResultSet resultSet2, String columnName) throws SQLException {
        List<String> dataList = new ArrayList<String>();
        /*
        while(resultSet.next()){
            String itemName = resultSet.getString(columnName);
            dataList.add(itemName);
        }
        */
        return dataList;
    }

    // function  for Data insert into MySQL Database
    public void InsertDataFromArryToMySql(int [] ArrayData,String tableName, String columnName)
    //InsertDataFromArryListToMySql

    //  public void InsertDataFromArryToMySql()
    {
        /*

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
        */
    }


    // Function for Insert Single value in a table

    public void InsertDataFromStringToMySql(String ArrayData,String tableName, String columnName)


    //  public void InsertDataFromArryToMySql()
    {
/*
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
        connection = ConnectionConfiguration.getConnection();
        */
    }




    public List<String> directDatabaseQueryExecute(String passQuery,String dataColumn)throws Exception{
        List<String> data = new ArrayList<String>();
/*
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
        */
        return data;
    }

//

    public void InsertDataFromArryListToMySql(List<Object> list,String tableName, String columnName)
    //InsertDataFromArryListToMySql

    //  public void InsertDataFromArryToMySql()
    {
        /*

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
        */
    }

}
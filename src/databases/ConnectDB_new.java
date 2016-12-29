package databases;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by salma on 12/29/2016.
 */
public class ConnectDB_new {


        Connection connect = null;
        Statement statement = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;

        public static Properties loadProperties() throws IOException {
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
            System.out.println("Database is connected");

        }

        public void createDatabaseMySql(String sql) {
            try {
                connectToDatabase();
                statement = connect.createStatement();
                statement.executeUpdate(sql);
                System.out.println("Database created");
            } catch(SQLException se){
                //errors for JDBC
                se.printStackTrace();
            } catch(Exception e){
                e.printStackTrace();//errors for class.forname

            }finally{
                //finally block used to close resources
                try{
                    if(statement!=null)
                        statement.close();
                }catch(SQLException se2){
                }// nothing we can do
                try{
                    if(connect!=null)
                        connect.close();
                }catch(SQLException se){
                    se.printStackTrace();
                }//end finally try
            }//end try


        }
        public void dropDatabaseMySql(String sql) {
            try {
                connectToDatabase();
                statement = connect.createStatement();
                statement.executeUpdate(sql);
                System.out.println("Database dropped");
            } catch(SQLException se){
                //errors for JDBC
                se.printStackTrace();
            } catch(Exception e){
                e.printStackTrace();//errors for class.forname

            }finally{
                //finally block used to close resources
                try{
                    if(statement!=null)
                        statement.close();
                }catch(SQLException se2){
                }// nothing we can do
                try{
                    if(connect!=null)
                        connect.close();
                }catch(SQLException se){
                    se.printStackTrace();
                }//end finally try
            }//end try


        }

        public void createTableInSelectedDatabase(String sql){
            try{
                connectToDatabase();

                statement=connect.createStatement();

                statement.executeUpdate(sql);


            }catch(SQLException se){
                //errors for JDBC
                se.printStackTrace();
            } catch(Exception e){
                e.printStackTrace();//errors for class.forname

            }finally{
                //finally block used to close resources
                try{
                    if(statement!=null)
                        statement.close();
                }catch(SQLException se2){
                }// nothing we can do
                try{
                    if(connect!=null)
                        connect.close();
                }catch(SQLException se){
                    se.printStackTrace();
                }//end finally try
            }//end try
        }
        public void DeleteTableInSelectedDatabase(String sql) {
            try {
                connectToDatabase();

                statement = connect.createStatement();

                statement.executeUpdate(sql);


            } catch (SQLException se) {
                //errors for JDBC
                se.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();//errors for class.forname

            } finally {
                //finally block used to close resources
                try {
                    if (statement != null)
                        statement.close();
                } catch (SQLException se2) {
                }// nothing we can do
                try {
                    if (connect != null)
                        connect.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }//end finally try
            }//end try
        }
        public void insertTwoRecordsAtOnce(String sql,String sql1) {
            try {
                connectToDatabase();

                statement = connect.createStatement();

                statement.executeUpdate(sql);
                statement.executeUpdate(sql1);


            } catch (SQLException se) {
                //errors for JDBC
                se.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();//errors for class.forname

            } finally {
                //finally block used to close resources
                try {
                    if (statement != null)
                        statement.close();
                } catch (SQLException se2) {
                }// nothing we can do
                try {
                    if (connect != null)
                        connect.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }//end finally try
            }//end try
        }

        public void retrieveDataFromTable(String sql) {
            try {
                connectToDatabase();

                statement = connect.createStatement();
                resultSet = statement.executeQuery(sql);
                //Extract data from result set
                System.out.println("All the records in table are showing below: ");
                List<String> list=new ArrayList<>();
                while (resultSet.next()){
                    //Retrieve by column name

                    list.add(resultSet.getString("empId"));
                    list.add(resultSet.getString("Name"));
                    list.add(resultSet.getString("Dept"));
                    list.add(resultSet.getString("salary"));
                    //list.add(rs.getString("Last"));



                    // String firstName = rs.getString("Name");
                    // String lastName = rs.getString("Last");

                    // System.out.print("Name: " + firstName + " Surname: " + lastName+"\n");
                }
                for(String st:list){
                    System.out.println(st);
                }

                resultSet.close();
                statement.close();
                connect.close();
            }catch(SQLException se){
                //Handle errors for JDBC
                se.printStackTrace();
            }catch(Exception e){
                //Handle errors for Class.forName
                e.printStackTrace();
            }finally{
                //finally block used to close resources
                try {
                    if (statement != null)
                        statement.close();
                } catch (SQLException se2) {
                }// nothing we can do
                try {
                    if (connect != null)
                        connect.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }//end finally try
            }//end try

        }




    }




package databases; /**
 * Created by Kamran on 2016-12-21.
 */

    import com.sun.prism.shader.Solid_ImagePattern_Loader;

    import java.sql.SQLException;
    import java.sql.*;

    public class connectDB {

        public static Connection connection;

        private static ResultSet data;

        public static void main(String[] args) {

                try {


                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "gurya");

                    Statement stmt = connection.createStatement();

                    stmt.execute("Insert into employee (name, owner) values ('Qamar', 'Javed');");
                    stmt.execute("Insert into employee (name, owner) values ('Salman', 'Feroze');");

                    String query = "select * from employee ;";
                    ResultSet rs = stmt.executeQuery(query);
                    while (rs.next()) {
                        String name = rs.getObject(1).toString();
                        String owner = rs.getObject(2).toString();
                        System.out.println("Name of the person is " + name + " and his owner is " + owner);
                        //Person table has name and gender column

                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    for(Throwable ex : e) {
                        System.err.println("Error occurred " + ex);
                    }
                    System.out.println("Error in fetching data");
                }


        }
    }

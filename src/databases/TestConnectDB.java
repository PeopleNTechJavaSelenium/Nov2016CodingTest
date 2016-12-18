package databases;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by mrahman on 12/18/16.
 */
public class TestConnectDB {
    public static void main(String [] args) throws Exception{
        ConnectDB connectDB = new ConnectDB();
        List<String> list = new ArrayList<String>();
        list = connectDB.readDataBase("cnnnewsvertical", "NewsTitle");
        System.out.println("Data is reading from the Table and displaying to the console");
        for(String st:list){
            System.out.println(st);
        }
    }

}

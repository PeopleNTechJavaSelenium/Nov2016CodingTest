package design;

import databases.ConnectDB;

public class CnnEmployee {



    /**

     * CnnEmployee class has a main methods where you will be able to create Object from

     * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible

     * to use with proper business work flow.Think as a Software Architect, Product Designer and

     * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate

     * more to design an application that will meet for fortune 500 Employee Information

     * Services.

     *

     * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.

     *

     **/

    public static void main(String[] args) {
     EmployeeInfo EI=new EmployeeInfo();

        EI.setEmployeeID(100);
        EI.setEmployeetName("Rajib Das");
        EI.setSalary(10000.0);

        ConnectDB connectDB = new ConnectDB();
        try { //Database: core_java  table: designcnn  column: id,name,salary
            connectDB.InsertDataFromStringToMySqlThreeCol("designcnn",Integer.toString(EI.employeeId()),"id",EI.employeeName(),"name",Double.toString(EI.salary()),"salary");
            System.out.println(connectDB.readDataBase("designcnn", "id"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }





    }




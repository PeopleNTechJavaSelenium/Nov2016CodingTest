package design;



public class EmployeeInfo extends EmployeeAbstract implements Employee{



 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.

 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class

 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,

 * go to CnnEmployee class to apply all the fields and attributes.

 *

 * Important: YOU MUST USE the

 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.

 * Use all kind of keywords(super,this,static,final........)

 *

 */



	/*

	 * declare few static and final fields and some non-static fields

	 */

    static String companyName;



	/*

	 * You must implement the logic for below 2 methods and

	 * following 2 methods are prototype as well for other methods need to be design,

	 * as you will come up with the new ideas.

	 */




	/*

	 * you must have multiple constructor.

	 * Must implement below constructor.

	 */

	public EmployeeInfo(){}
    public EmployeeInfo(int employeeId){
    this.setEmployeeID(employeeId);
    }

    public EmployeeInfo(String name, int employeeId){
    this.setEmployeetName(name);
    this.setEmployeeID(employeeId);
    }

    public EmployeeInfo(int employeeId,String name,String dept){
        this.setEmployeeID(employeeId);
        this.setEmployeetName(name);
        this.assignDepartment(dept);
    }

     /*

	 * This methods should calculate Employee bonus based on salary and performance.

	 * Then it will return the total yearly bonus. So you need to implement the logic.

	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.

	 * You can set arbitrary number for performance.

	 * So you probably need to send 2 arguments.

	 *

	 */

    public static int calculateEmployeBonus(double salary){
        int total=0;
        if(salary<=2000)
            total=(int)(salary*.02);
        else if(salary<=5000)
            total=(int)(salary*.05);
        else if(salary<=10000)
            total=(int)(salary*.10);
        return total;
    }



	/*

	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.

	 * Then it will return the total pension. So you need to implement the logic.

	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.

	 * So you probably need to send 2 arguments.

	 *

	 */

    public static int calculateEmployePension(double salary, int years){

        int total=0;
        switch(years){
            case 1:
                total = (int) (salary*0.05);
                break;

            case 2://10% for 2 years
                total = (int)(salary * 0.10);
                break;
            default:
                break;
        }

        return total;

    }

}

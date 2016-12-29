package design;

class EmployeeInfo  extends EmployeeAbs{

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

	final void CEO (){
		System.out.println("Jubar Khan is the CEO ");
	}

	public void numberOfEmployees(){
		System.out.println("Number of employeed sre 300");
	}

	static String companyName;
	static String vicePrisdent;




	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId){
		this.employeeId();

	}
	public EmployeeInfo(String name, int employeeId){
		this.employeeId();
		this.employeeName();
	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static void calculateEmployeBonus(){

		EmployeeInfo salray = new EmployeeInfo();
		salray.bonus(55000,10);
		salray.bonus(55000,8);

	}

	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static int calculateEmployePension(){
		int salary = 50000;
		int pension= 5;
		int pension2 = 10;

	public int total (int salary, int pension){
		return salary*pension;

	}
	public int total2(int salary, int pension2) {
		return salary * pension2;
	}
}





}
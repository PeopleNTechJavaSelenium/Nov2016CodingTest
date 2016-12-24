package design;

public class EmployeeInfo extends EmployeeDetails {

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
	static int pension;
	static int bonus;
	final int bestPerformance=9;
	final int averagePerformance=7;
	static String companyName;
	public final int weekHour=40;


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
		System.out.println("EmployeeId of this employee "+ employeeId);

	}
	public EmployeeInfo(String name, int employeeId){
		System.out.println("name of this employee "+name);
	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static int calculateEmployeBonus(int employeePerformance,int salary){
		int total=0;
		if(employeePerformance>=0){
			total=(int)(salary*.10);

		}
		if((employeePerformance>=7)&& (employeePerformance<9)){
			total=(int)(salary*.08);
		}
		bonus+=total;
		return bonus;
	}

	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static int calculateEmployePension(int salary,int year){
		int total=0;

		if(year==1){
			total=(int)(salary*.03);{

			}

		}
		if(year==3){
			total=(int)(salary*.10);
		}
		pension=pension+total;

		return pension;
	}

	@Override
	public int yearsWorked(int years) {
		return workingYear=years;
	}
}

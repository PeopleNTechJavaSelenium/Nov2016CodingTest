package design;

import java.util.Date;

public class EmployeeInfo extends EmployeeAbs implements Employee{

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
	private String employeeJobTitle;
	private String employeeEduLevel;
	private String employeeAddress;
	//private int hours;
	//private int hourlyRate;

	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */

	public EmployeeInfo(){

	}

	public EmployeeInfo(int employeeId){
		this.assignEmployeeId(employeeId);

	}
	public EmployeeInfo(String name, int employeeId){
		this.assignEmployeeName(name);
		this.assignEmployeeId(employeeId);

	}
	public EmployeeInfo(String name, int employeeId, String department){
		this.assignEmployeeName(name);
		this.assignEmployeeId(employeeId);
		this.assignDepartment(department);
	}

	public EmployeeInfo(EmployeeInfo empInfo){
		this.assignEmployeeId(empInfo.employeeId());
		this.assignEmployeeName(empInfo.employeeName());
		this.assignDepartment(empInfo.department());
		this.setEmployeeJobTitle(empInfo.empJobTitle());
		this.assignEmployeeSalary(empInfo.salary());
		this.setEmployeeEduLevel(empInfo.empEduLevel());
		this.setEmployeeAddress(empInfo.employeeAddress());
	}



	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static int calculateEmployeBonus(double Salary, int performance){
		int total=0;

		switch(performance){
			case 1://best performance
				total = (int) (Salary * 0.10);
				break;
			case 2://average performance
				total = (int) (Salary * 0.08);
				break;
			default:
		}


		return total;
	}

	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static int calculateEmployePension(double Salary, int noYears){
		int total=0;

		switch(noYears) {
			case 1://5% of the salary for 1 year
				total = (int) (Salary * 0.05);
				break;
			case 2://10% for 2 years
				total = (int) (Salary * 0.10);
				break;
			default:
				break;
		}


		return total;
	}

	public String employeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	//Abstract methods here
	@Override
	public String empJobTitle() {
		return employeeJobTitle;
	}
	public void setEmployeeJobTitle(String jobTitle){
		this.employeeJobTitle=jobTitle;
	}

	@Override
	public String empEduLevel() {
		return employeeEduLevel;
	}
	public void setEmployeeEduLevel(String employeeEduLevel){
		this.employeeEduLevel=employeeEduLevel;
	}
}
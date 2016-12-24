package design;


import com.sun.source.tree.DoWhileLoopTree;

import java.util.Scanner;

public class EmployeeInfo implements Employee {
	Scanner sc = new Scanner(System.in);
	private int empID;
	private String empName;
	public static int yearEmp;
	private String address;   // not assigned yet
	private String companyName;        // not assigned yet
	public String dept;                // not assigned yet

	public static double salary;
	public static double bonus;
	public static double pension;
	public static String performance;
	private String position;


	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}


	public EmployeeInfo() {

	}

	public EmployeeInfo(String empName, int empID) {

	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;

	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

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
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */


	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static double calculateEmployeBonus() {
		if (performance.equals("A")) {
			bonus = (salary * 0.1);
		} else if (performance.equals("B")) {
			bonus = (salary * 0.08);
		} else if (performance.equals("B")) {
			bonus = (salary * 0.06);
		} else if (performance.equals("C")) {
			bonus = (salary * 0.04);
		} else {
			bonus = 0;
		}
		//System.out.println("The bonus this year based on the performance "+ performance+" is : "+bonus);

		double total = bonus + salary;
		//System.out.println("The total of salary and bonus is : "+ total+"K");
		return total;
	}

	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static void calculateEmployePension() {
		if (yearEmp < 2) {
			pension = salary * 0.05;
		} else if (yearEmp >= 2 && yearEmp < 4) {
			pension = salary * 0.1;
		} else if (yearEmp >= 4 && yearEmp < 6) {
			pension = salary * 0.15;
		} else if (yearEmp >= 6 && yearEmp < 8) {
			pension = salary * 0.20;
		} else if (yearEmp >= 8 && yearEmp < 10) {
			pension = salary * 0.25;
		} else if (yearEmp >= 10) {
			pension = salary * 0.5;
		}


		//System.out.println("The pension based on your  "+ yearEmp+" of experience is  : "+pension);


	}

	@Override
	public int employeeId() {
		System.out.println("Please enter employee ID");
		empID = sc.nextInt();
		return empID;


	}

	@Override
	public String employeeName() {
		System.out.println("Please enter employee name");
		empName = sc.next();
		return empName;
	}

	@Override
	public void assignDepartment() {
		System.out.println("Enter the department name ");
		dept = sc.next();
	}

	@Override
	public double calculateSalary() {
		if (yearEmp >= 0 && yearEmp <= 2) {
			salary = 60000.;
		} else if (yearEmp >= 2 && yearEmp <= 4) {
			salary = 85000.;
		} else if (yearEmp >= 4 && yearEmp <= 6) {
			salary = 100000.;
		} else if (yearEmp >= 6 && yearEmp <= 8) {
			salary = 120000.;
		} else if (yearEmp > 8) {
			salary = 160000.;
		}
		//System.out.println("\nThe base yearly salary for "+ empName+ " is "+salary+" K");
		return salary;
	}


	@Override
	public void benefitLayout() {

		System.out.println(" Benefit for " + empName + " Include;");

		if (yearEmp == 1) {
			System.out.print("\n[Health insurance and PTO will roll in after 1000 hours]");
		} else if (yearEmp == 2) {
			System.out.print("\n[401k-HealthInsurance]");

		} else if (yearEmp >= 3) {
			System.out.print("\n[Full package ; 401k-HealthInsurance-paytimeOff-dental] ");

		} else {
			System.out.print("\nEmoplyee is not eligable for Benefit for the first 3 month]");

		}
	}

	public void StringPrint() {
		System.out.print("Employee \n[" + empName + " ID number " + empID + "]\n" + "Department :" + dept + " Position : " + getPosition() + "\nCompany name: " + getCompanyName());
		System.out.print("\nPerformance: [" + performance + "]\nExperience: [" + yearEmp + "]\n Yearly salary: [" + salary + "]\nBonus: [" + bonus + "]");
		System.out.print("\nPension based on " + yearEmp + " years of experience:[" + pension + "] ");
	}


	public int yearsOFEmployment() {
		System.out.println("\nplease enter how many years " + empName + " has worked at the company?");
		yearEmp = sc.nextInt();

		return yearEmp;
	}

	public String getPerformance() {
		System.out.println("\nPlease Rate the " + empName + " performance : [A,B,C,D]");

			performance=sc.next();

			if(!performance.equals("A") && !performance.equals("B") && !performance.equals("C") && !performance.equals("D")){
			System.out.println("Please Enter a Valid Rate [A,B,C,D] is case sensitive ");

		}
		return performance;




	}

}

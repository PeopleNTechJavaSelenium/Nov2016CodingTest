package design;

import databases.ConnectDB;

import java.util.Scanner;

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
		EmployeeInfo newEmployee = new EmployeeInfo();

		printTitle();

		while(addEmployeeOption()){
			addEmployee(newEmployee);
		}

		viewEmployees();
	}

	public static void printTitle(){
		String menuTitle="Add New Employee in DB";
		System.out.println(menuTitle);
		for (int i = 0; i < menuTitle.length(); i++) {
			System.out.print("=");
		}
	}

	public static Boolean addEmployeeOption(){
		Scanner stdin = new Scanner(System.in);
		System.out.print("\nAdd new employee? (Y//N): ");
		String addOption = stdin.next();
		if (addOption.equals("Y") || addOption.equals("y")){
			return true;
		}else if(addOption.equals("N") || addOption.equals("n")){
			return false;
		}else{
			System.out.println("Invalid Option");
			addEmployeeOption();
		}
		return false;
	}

	public static void viewEmployees(){
		ConnectDB connectDB = new ConnectDB();
		System.out.println("Employees in DB:");
		try {
			System.out.println(connectDB.readDataBase("DesignCNN","DesignCNNName"));
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	public static void addEmployee(EmployeeInfo employeeInfo){
		Scanner stdin = new Scanner(System.in);
		ConnectDB connectDB = new ConnectDB();

		int employeeHours, employeeRate;

		//System.out.print("Enter Employee ID: ");
		//employeeInfo.assignEmployeeId(stdin.nextInt());
		System.out.print("\n\nEnter Name: ");
		employeeInfo.assignEmployeeName(stdin.nextLine());
		System.out.print("Enter Department: ");
		employeeInfo.assignDepartment(stdin.next());
		System.out.print("Enter Job Title: ");
		employeeInfo.setEmployeeJobTitle(stdin.next());
		System.out.println("Enter Hourly Rate: ");
		employeeRate=stdin.nextInt();
		System.out.println("Enter Hours: ");
		employeeHours=stdin.nextInt();
		employeeInfo.assignEmployeeSalary(employeeInfo.calculateSalary(employeeHours,employeeRate));
		System.out.print("Enter max education level: ");
		employeeInfo.setEmployeeEduLevel(stdin.next());
		System.out.println("Enter Address");
		employeeInfo.setEmployeeAddress(stdin.next());

		connectDB.InsertDataFromStringToMySqlSixCol("DesignCNN",employeeInfo.employeeName(),"DesignCNNName",employeeInfo.department(),"DesignCNNDept",employeeInfo.empJobTitle(),"DesignCNNJTitle",Integer.toString(employeeInfo.calculateSalary(employeeHours,employeeRate)),"DesignCNNSalary",employeeInfo.empEduLevel(),"DesignCNNEducation",employeeInfo.employeeAddress(),"DesignCNNAddress");


		System.out.println("Exported to DB");
		employeeInfo=null;

	}

}
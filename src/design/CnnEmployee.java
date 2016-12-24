package design;

import databases.ConnectDB;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CnnEmployee {

	/**
	 * CnnEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 * <p>
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 **/
	public static void main(String[] args) {


		//addEmployee(true);
		addEmployee();
		//list(true);
		//list(false);

	}

	private static void addEmployee() {
		Scanner stdin = new Scanner(System.in);

		EmployeeInfo empinfo = new EmployeeInfo();

		System.out.print("Do you want to use Mongodb or Mysql (true for Mongodb and false for Mysql) ? ");

		boolean bmongodb = stdin.nextBoolean();

		stdin.nextLine();
		try {
			System.out.print("Enter Name: ");
			empinfo.asignemployeeName(stdin.nextLine());
			System.out.print("Enter Department: ");
			empinfo.assignDepartment(stdin.nextLine());
			System.out.print("Enter Phone: ");
			empinfo.assignPhone(stdin.nextInt());
			System.out.print("Enter Salary: ");
			empinfo.assignSalary(stdin.nextDouble());
			stdin.nextLine();
			System.out.print("EduLevel: ");
			empinfo.assignemployeeEduLevel(stdin.nextLine());
			System.out.print("Enter SIN: ");
			empinfo.assignSIN(stdin.nextLine());
			System.out.print("Enter Address: ");
			empinfo.assignemployeeAddress(stdin.nextLine());
			System.out.print("Enter Job Title: ");
			empinfo.assignemployeeJob(stdin.nextLine());

			empinfo.add(bmongodb);
			list(bmongodb);

		} catch (Exception ex) {
			ex.printStackTrace();
			;
		}


	}

	private static void list(boolean mongodb) {
		List<EmployeeInfo> list = null;

		if (!mongodb) {
			System.out.println("\n\nData is reading from the Table (tbl_ProcessStudentInfo) and displaying to the console\n");
			list = EmployeeInfo.load();
		} else {
			System.out.println("\n\nData is reading from the MongoDb Collection (tbl_ProcessStudentInfo) and displaying to the console\n");
			list = EmployeeInfo.loadfromMongodb();
		}

		try {

			for (EmployeeInfo emp : list) {
				System.out.print("Name : " + emp.employeeName());
				System.out.print(", employeeAddress : " + emp.employeeAddress());
				System.out.print(", employeeEduLevel : " + emp.employeeEduLevel());
				System.out.print(", employeeJob : " + emp.employeeJob());
				System.out.print(", employeePhone : " + emp.employeePhone()+"\n");

				emp.benefitLayout();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	private static void addEmployee(boolean bmongodb) {
		Scanner stdin = new Scanner(System.in);

		EmployeeInfo empinfo = new EmployeeInfo();





		String inputString = "11-11-1985";
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date hireDate, dob;
		try {
			hireDate = dateFormat.parse("11-11-2013");
			dob = dateFormat.parse("11-11-1985");

			empinfo.asignemployeeName("Ahmad");
			empinfo.assignDepartment("computer science");
			empinfo.assignPhone(497894);
			empinfo.assignSalary(490.44);
			empinfo.assignSIN("58743N");
			empinfo.assignemployeeEduLevel("Bsc");
			empinfo.assignemployeeAddress("Mississagua ON ");
			empinfo.assignemployeeJob("teacher");

			empinfo.add(bmongodb);
		} catch (Exception ex) {
			ex.printStackTrace();
			;
		}

	}
}

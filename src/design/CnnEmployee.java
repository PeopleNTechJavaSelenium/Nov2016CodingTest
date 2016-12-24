package design;

import databases.ConnectDB;

import java.util.ArrayList;
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
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		List<String> storeInfo=new ArrayList<>();
		List<Integer> storeInfoInt= new ArrayList<>();
		EmployeeInfo employee=new EmployeeInfo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employees ID");
		int a=sc.nextInt();
		employee.assignEmployeeId(a);
		storeInfoInt.add(a);
		System.out.println("Enter Employees Name");
		String b=sc.next();
		employee.assignEmployeeName(b);
		storeInfo.add(b);
		System.out.println("Assign Employee department");
		String c= sc.next();
		employee.assignDepartment(c);
		storeInfo.add(c);
		System.out.println("Enter Employee Rate");
		int eRate=sc.nextInt();
		storeInfoInt.add(eRate);
		System.out.println("Enter the number of hrs worked");
		int eHrs=sc.nextInt();
		int d= employee.calculateSalary(eRate,eHrs);
		storeInfoInt.add(d);
		employee.benefitLayout(d);
		System.out.println("Employee marital Status(Single or Married)");
		String e=sc.next();
		employee.maritalStatus(e);
		storeInfo.add(e);
		int f=employee.calculateYearlyEmployeeSalary(d);
		storeInfoInt.add(f);
		int g= EmployeeInfo.calculateEmployePension(d,3);
		int h=EmployeeInfo.calculateEmployeBonus(d,1);
		storeInfoInt.add(g);
		storeInfoInt.add(h);
		ConnectDB connectDB1=new ConnectDB();
		List<String> retrievePerData=new ArrayList<>();
		List<String> retrieveMonData= new ArrayList<>();
		try {

			//create table for employee in DB
			connectDB1.Query("create table employeeinfo(employeepersonalinfo Text,employeeSalaryinfo Integer);");
			//Store employee personal data
			connectDB1.InsertDataFromArryListStringToMySql(storeInfo, "employeeinfo", "employeepersonalinfo");
			//store employee monetary data
			connectDB1.InsertDataFromArryListIntToMySql(storeInfoInt,"employeeinfo","employeeSalaryinfo");
				//retrieving From database(below)

			retrievePerData = connectDB1.readDataBase("employeeinfo", "employeepersonalinfo");
			retrieveMonData=connectDB1.readDataBase("employeeinfo","employeeSalaryinfo");

		} catch (Exception z) {
			z.printStackTrace();

		}
		for (String st : retrievePerData) {
			if (st == null) {

			} else {
				System.out.println("Info =" + st);
			}
		}
		for (String st2 : retrieveMonData) {
			if (st2 == null) {
			} else {
				System.out.println("Monetary info= " + st2);
			}

		}
	}
}

		






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

	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

		Employee emp = new EmployeeInfo("CNN", 101);
		emp.employeeId(101);
		emp.employeeName("Jerry");
		emp.assignDepartment("IT");
		emp.calculateSalary(90000);
		emp.benefitLayout("Yes");


		EmployeeDetails empdetails = new EmployeeInfo(102);
		empdetails.employeeStatus("Yes");


		EmployeeInfo.calculateEmployeBonus(95000, 5 );
		EmployeeInfo.calculateEmployePension(2, 95000, 10 );

	}


	//Database connection







}

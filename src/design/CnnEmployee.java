package employee.info.system;
import design.EmployeeInfo;


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

		EmployeeInfo empOne = new EmployeeInfo("Peter Parker","769");
		empOne.calculateSalary("75000");
		empOne.set("Photography");

		Object peterSalary = new Salary("Peter Parker", 1, 3600.00);
		peterSalary.mailCheck();
		empOne.set();
		peterSalary.setYearOfEmployeement(10);
		peterSalary.getBonus();
		peterSalary.toString();

	}

}

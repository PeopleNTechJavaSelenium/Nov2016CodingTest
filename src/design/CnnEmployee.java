package design;

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

		EmployeeInfo empOne = new EmployeeInfo("Daisy OP", 34);
		System.out.println("My Employee ID is "+empOne.employeeId() );
		empOne.assignDepartment();
		System.out.println("My department is.."+empOne.getDepartment() );
		System.out.println( "My salary is  "+empOne.calculateSalary());
		empOne.benefitLayout();
		System.out.println(empOne.getBenefit());
		EmployeeInfo person = new Janitor(40,"Micheal");
		System.out.println("My Janitor Employee ID is  "+person.employeeId());
		person.SaveEmployee();
	}

}

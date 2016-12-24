package design;

public interface Employee {
	
	/*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
	//please read the following method and understand the business requirements of these following methods
	//and then implement these in a concrete class.

	//employeeId() will return employee id.
	public int employeeId(int empID);
	
	//employeeName() will return employee name
	public String employeeName(String empName);
	
	//assignDepartment() will assign employee to departments
    public void assignDepartment(String Dept);
	
	//calculate employee salary
	public int calculateSalary(int salary);
	
	//employee benefit
	public void benefitLayout(String Benefit);


	

}

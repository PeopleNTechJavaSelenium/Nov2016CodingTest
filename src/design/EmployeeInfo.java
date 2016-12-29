package design;

/**
 * Created by abra on 12/28/16.
 */
public class EmployeeInfo extends EmployeesAbstract {

	final void CEO() {
		System.out.println("Bond, James is the CEO");
	}

	public void numberOfEmployees() {
		System.out.println("Number of employees are 100");
	}

	static String companyName;
	static String vicePresident;

	public EmployeeInfo() {

	}

	public EmployeeInfo(int employeeID) {
		this.employeeID();
	}

	public EmployeeInfo(String name, int employeeID) {
		this.employeeID();
		this.employeeName();
	}

	public static void calculateEmployeeBonus() {

		EmployeeInfo bonus = new EmployeeInfo();
		bonus.bonus1(55000, 10);
		bonus.bonus2(55000, 8);
	}

	@Override
	public int employeeId() {
		return 0;
	}


//    public static int calculateEmployeePension() {
//        int salary = 5000;
//        int pension = 5;
//        int pension2 = 10;
//
//    public int total1(int salary, int pension) {
//        return salary * pension;
//    }
//
//    public int total2(int salary, int pension2) {
//        return salary * pension2;
//    }
//}

}




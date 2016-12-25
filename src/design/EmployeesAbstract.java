package design;

/**
 * Created by Jubar on 12/24/2016.
 */
public class EmployeesAbstract implements Employee {
    int EmID= 12;
    String emName = "Bob";
    String dName = "Design";
    int cal=80000;


    int sal = 55000;
    int bo = 10;
    int ba = 2;

    public int bonus(int sal, int bo){
        return sal * bo;

    }

    public int bonus2 (int sal,  int ba){
        return sal * ba;

    }



    @Override
    public void employeeId() {
        this.EmID= EmID;
    }

    @Override
    public String employeeName() {
        return this.emName;
    }
    @Override
    public void assignDepartment() {
        this.dName = dName;
    }

    @Override
    public int calculateSalary() {
        return this.cal;
    }

    @Override
    public void benefitLayout() {
        System.out.println("Has paid holidays off ");
    }

    @Override
    public void address() {
        System.out.println("Address is 437 5th AVE");
    }
}

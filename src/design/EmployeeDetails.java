package design;

/**
 * Created by Zahid on 12/23/2016.
 */
public abstract class EmployeeDetails implements Employee {

    public int id;
    public String name;
    public String department;
    private double totalSalary;
    public int workingYear;
    private double commission;
    private double baseSalary;
    public boolean healthInsurance,vacation;


    @Override
    public int employeeId() {
        return id;
    }

    @Override
    public String employeeName() {
        return name;
    }

    @Override
    public void assignDepartment() {
        System.out.println("This employee has not been assigned to any department");

    }
    //overloading
    public void assignDepartment(String department){
        this.department=department;
    }

    @Override
    public int calculateSalary() {
        return (int)(totalSalary+commission);
    }


    @Override
    public void benefitLayout() {
        System.out.println("insurance"+healthInsurance+" ,Vacation: "+vacation);

    }
    public abstract int yearsWorked(int years);
}

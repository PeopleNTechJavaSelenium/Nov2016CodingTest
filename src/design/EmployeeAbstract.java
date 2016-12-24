package design;

/**
 * Created by Rajib on 12/23/2016.
 */
public abstract class EmployeeAbstract implements Employee {

    private int employeeID;
    private String employeetName;
    private double employeeSalary;
    private String employeeBenefits;
    private String employeeDepartment;

    public int employeeId(){
    return this.employeeID;
    }

    public void setEmployeeID(int ID){
        this.employeeID=ID;
    }

    public String employeeName(){
        return this.employeetName;
    }

     public void setEmployeetName(String name){
        this.employeetName=name;
     }

     public int calculateSalary(int hour,int rate){
         int salary=hour*rate;
         return salary;
     }

     public double salary(){
         return employeeSalary;
     }

     public void setSalary(double salary) {
         this.employeeSalary = salary;
     }

     public void benefitLayout(double salary){
         if(salary<10000)
             System.out.println("7 Paid Vacation Days");
         else if(salary>=10000)
             System.out.println("14 paid vacation days");
         else
             System.out.println("5 paid vacation days");
     }

     public String department(){
         return this.employeeDepartment;
    }

    public void assignDepartment(String dept){
         this.employeeDepartment=dept;
    }

}

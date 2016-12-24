package design;

import java.util.Scanner;

/**
 * Created by furqan on 12/23/2016.
 */
public abstract class ImplementEmployeeInterface implements Employee{
    private int eID;
    private String eName;
    private String eDept;
    public int salary;


    //employeeId() will return employee id.
    public int employeeId(){
        return this.eID;
    }
    public void assignEmployeeId(int eID){
        this.eID=eID;
    }
    //employeeName() will return employee name
    public String employeeName(){
        return this.eName;
    }

    public void assignEmployeeName(String eName){
        this.eName=eName;
    }
    //assignDepartment() will assign employee to departments
    public void assignDepartment(String dept){
        this.eDept=dept;
    }
    public String department(){
        return this.eDept;
    }

    //calculate employee salary
    public int calculateSalary(int hrs, int rate){
        this.salary=hrs*rate;
        return salary;
    }

    //employee benefit

    public void benefitLayout(int salary){
        if(salary>5000){
            System.out.println("No Benefits");}
            else{
                System.out.println("Free Insurance");}
        }

    public abstract int calculateYearlyEmployeeSalary(int salary);
    public abstract String maritalStatus(String mS);

}

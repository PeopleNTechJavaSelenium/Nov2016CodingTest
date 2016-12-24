package design;

import java.util.Date;

/**
 * Created by Bilal on 18-12-2016.
 */
public abstract class EmployeeAbs implements Employee {


    private int empID;
    private String empName;
    private String empDepartment;
    private double empSalary;
    private int empBenefit;

    public abstract String empJobTitle();
    public abstract String empEduLevel();

    public int employeeId(){
        return this.empID;
    }
    public void assignEmployeeId(int empID){
        this.empID = empID;
    }

    public String employeeName(){
        return this.empName;
    }
    public void assignEmployeeName(String empName){
        this.empName = empName;
    }

    public String department(){
        return this.empDepartment;
    }
    public void assignDepartment(String department){
        this.empDepartment=department;
    }

    public double salary(){
        return empSalary;
    }
    public void assignEmployeeSalary(double salary){
        this.empSalary=salary;
    }

    public int calculateSalary(int hours, int rate){
        int salary = hours*rate;
        return salary;
    }

    public void benefitLayout(double salary){
        if (salary<10000){
            System.out.println("Number of off days: 5");
        }
        if(salary>=10000){
            System.out.println("Number of off days: 10");
        }
    }
}
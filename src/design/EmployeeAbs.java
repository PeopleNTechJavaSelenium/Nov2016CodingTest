package design;

import java.util.Date;

/**
 * Created by izran on 12/21/2016.
 */
public abstract class EmployeeAbs implements Employee   {

    public abstract int employeePhone();

    private int _employeeId;
    private String _employeeName;
    private String _employeeDepartment;
    private double _employeeSalary;
    private int _employeebenefit;
    private String _employeeSIN;



    public abstract String employeeJob();
    public abstract String employeeEduLevel();
    public abstract String employeeAddress();
    public abstract int employeeCommission();

    public int employeeId(){

        return this._employeeId;
    }

    public void assignemployeeId(int employeeId) {

        this._employeeId = employeeId;
    }


    public String employeeName(){

        return this._employeeName;
    }

    public void asignemployeeName(String employeeName){

        this._employeeName = employeeName;
    }

    public String SIN(){
       return this._employeeSIN;

    }

    public void assignSIN(String SIN){
        this._employeeSIN = SIN;

    }


    public double salary(){
        return this._employeeSalary;

    }

    public void assignSalary(double salary){
        this._employeeSalary = salary;

    }

    public int benefit(){
        return this._employeebenefit;

    }


    public String department(){
        return this._employeeDepartment;

    }

    public void assignDepartment(String department){
          this._employeeDepartment = department;

    }




    public int calculateSalary(int hrs,int hourlyRate) {
        return hrs * hourlyRate;
    }

    public void benefitLayout(){
        //this._employeebenefit = benefit;
        if (_employeeSalary<10000){
            System.out.println("Number of off days: 5");
        }

        if(_employeeSalary>=10000){
            System.out.println("Number of off days: 10");
        }
    }

    public  void assignemployeeSIN(String SIN){
        this._employeeSIN = SIN;
    }


}

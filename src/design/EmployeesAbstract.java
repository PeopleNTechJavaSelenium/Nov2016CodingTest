package design;

/**
 * Created by abra on 12/27/16.
 */
public abstract class EmployeesAbstract implements Employee {



    int empID=007;
    String empName="Bond, James";
    String dptName="Design";
    int cal=80000;

    int salary=55000;
    int bonusPct1=10;
    int bonusPct2=2;


    public int bonus1(int salary, int bonusPct1){
        return salary*bonusPct1;
    }

    public int bonus2(int salary, int bonusPct2){
        return salary*bonusPct2;
    }


    public void employeeID(){
        this.empID=empID;
    }

    public String employeeName(){
        return this.empName;
    }

    public void assignDepartment(){
        this.dptName=dptName;
    }

    public int calculateSalary(){
        return this.cal;
    }

    public void benefitLayout(){
        System.out.println("Has paid holidays off");
    }

    public void address(){
        System.out.println("Address : 59 Prairie Dr");
    }


}

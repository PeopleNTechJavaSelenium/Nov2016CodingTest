package design;

/**
 * Created by salma on 12/19/2016.
 */
public abstract class EmployeeDetails implements Employee {
    public String Dept;


    public int employeeId(int empID)
    {
        System.out.println("Employee Id is: " + empID);
        return empID;
    }


    public String employeeName(String empName)
    {
        System.out.println("Employee name is: "+ empName);
        return empName;
    }




    //calculate salary

    public int calculateSalary(int salary){
        System.out.println("Employee salary is: " + salary);
    return salary;

    }

    public void assignDepartment(String Dept){
        if(Dept == "IT")
            System.out.println("The employee belongs to:"+ Dept);
        else if(Dept == "Accounting")
            System.out.println("The employee belongs to:" + Dept);
        else
            System.out.println("The employee does not work in this company");

    }



    public void benefitLayout(String Benefit)
    {

             if(Benefit =="Yes"){
                 System.out.println("The employee will be getting benefit");
             }
             else
                 System.out.println("The employee will not be getting benefit");
    }

  public abstract void employeeStatus(String Exempt);


    }



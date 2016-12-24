package design;


import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoException;
import databases.ConnectDB;
import parser.Student;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeInfo extends EmployeeAbs implements Employee {
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to CnnEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;


	private String _jobTitle;
	private String _eduLevel;
	private String _address;
	private int _commission;
	private int _phone;


	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(){

	}

	public EmployeeInfo(int employeeId){
		this.assignemployeeId(employeeId);
	}
    public EmployeeInfo(String name, int employeeId){
		this.asignemployeeName(name);
		this.assignemployeeId(employeeId);
	}

	public EmployeeInfo(String name, int employeeId, String department){
		this.asignemployeeName(name);
		this.assignemployeeId(employeeId);
		this.assignDepartment(department);
	}

	public EmployeeInfo(EmployeeInfo empInfo){
		this.asignemployeeName(empInfo.employeeName());
		this.assignemployeeId(empInfo.employeeId());
		this.assignDepartment(empInfo.department());
		this.assignSalary(empInfo.salary());
		this.assignSIN(empInfo.SIN());
		this.assignemployeeEduLevel(empInfo.department());
		this.assignemployeeJob(empInfo.employeeJob());
		this.assignemployeeAddress(empInfo.employeeAddress());
	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeBonus(double Salary,int performance){
		int total=0;
		switch(performance){
			case 1://best performace
				total = (int) (Salary * 0.10);
				break;
			case 2://average performance
				total = (int) (Salary * 0.08);
				break;
			default:
		}

		return total;
	}



	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployePension(double Salary,int noyears){
		int total=0;
		switch(noyears) {
			case 1://5% of the salary for 1 year
				total = (int) (Salary * 0.05);
				break;
			case 2://10% for 2 years
				total = (int) (Salary * 0.10);
				break;
			default:
				break;
		}
		return total;
	}



	//here implmenation of EmployeeAbs start


	public String employeeJob(){
		return  _jobTitle;
	}

	public void assignemployeeJob(String jobTitle){
		_jobTitle = jobTitle;
	}


	public  String employeeEduLevel(){
		return _eduLevel;
	}

	public void assignemployeeEduLevel(String eduLevel){

		_eduLevel = eduLevel;
	}


	public String employeeAddress(){
		return _address;
	}

	public void assignemployeeAddress(String address){

		_address = address;
	}


	public  int employeeCommission(){
		return _commission;
	}



	public void assignDepartment(String department){
		super.assignDepartment(department);

	}

	public int employeePhone(){
		return _phone;
	}

	public void assignPhone(int phone){
		 _phone = phone;
	}

	public  static EmployeeInfo load(int employeeid) {
		ConnectDB connectDB = new ConnectDB();
		ResultSet rs = null;
		EmployeeInfo empinfo = new EmployeeInfo();
		try {
			//System.out.println("\n\nData is reading from the Table (tbl_employee) and displaying to the console\n");
			rs = connectDB.Query("select * from tbl_employee where employeeid="+employeeid);
			while (rs.next()) {
				empinfo.assignemployeeId((int)rs.getObject("employeeid") );
				empinfo.asignemployeeName(rs.getString("Name") );
				empinfo.assignDepartment(rs.getString("Department") );
				empinfo.assignPhone((int)rs.getObject("PHONENO") );
				empinfo.assignSalary((double)rs.getObject("SALARY") );
				empinfo.assignSIN(rs.getString("SIN") );
				empinfo.assignemployeeEduLevel(rs.getString("EduLevel") );
				empinfo.assignemployeeAddress(rs.getString("Address") );
				empinfo.assignemployeeJob(rs.getString("JobTitle"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs = null;
			}
		}
		return empinfo;
	}

	public  static List<EmployeeInfo> load(){
		List<EmployeeInfo> emplist =new ArrayList<EmployeeInfo>();
		ConnectDB connectDB = new ConnectDB();
		ResultSet rs = null;
		try {
			rs = connectDB.Query("select * from tbl_employee");
			while (rs.next()) {
				EmployeeInfo empinfo = new EmployeeInfo();
				empinfo.assignemployeeId((int)rs.getObject("employeeid") );
				empinfo.asignemployeeName(rs.getString("Name") );
				empinfo.assignDepartment(rs.getString("Department") );
				empinfo.assignSalary((double)rs.getObject("SALARY") );
				empinfo.assignPhone((int)rs.getObject("PHONENO") );
				empinfo.assignSIN(rs.getString("SIN") );
				empinfo.assignemployeeEduLevel(rs.getString("EduLevel") );
				empinfo.assignemployeeEduLevel((String)rs.getObject("EduLevel") );
				empinfo.assignemployeeAddress(rs.getString("Address") );
				empinfo.assignemployeeJob(rs.getString("JobTitle"));
				emplist.add(empinfo);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs = null;
			}
		};

		return  emplist;
	}

	public  static EmployeeInfo loadfromMongodb(int employeeid) {
		ConnectDB.connectMongoDB2();
		DBCursor cursor = null;
		EmployeeInfo empinfo = new EmployeeInfo();
		try{
			cursor = ConnectDB.getMongoDBDataDocument("tbl_employee");
			while (cursor.hasNext()) {
				DBObject rs = cursor.next();
				empinfo.asignemployeeName((String)rs.get("Name") );
				empinfo.assignDepartment((String)rs.get("Department") );
				empinfo.assignPhone((int)rs.get("PHONENO") );
				empinfo.assignSalary((double)rs.get("SALARY") );
				empinfo.assignSIN((String)rs.get("SIN") );
				empinfo.assignemployeeJob((String)rs.get("JobTitle") );
				empinfo.assignemployeeEduLevel((String)rs.get("EduLevel") );
				empinfo.assignemployeeAddress((String)rs.get("Address") );
			}
		} catch(MongoException e){
			e.printStackTrace();
		} finally{
			if (cursor != null) {
				cursor = null;
			}
		}
		return empinfo;
	}

	public  static List<EmployeeInfo> loadfromMongodb(){
		List<EmployeeInfo> emplist = new ArrayList<EmployeeInfo>();
		ConnectDB.connectMongoDB2();
		DBCursor cursor = null;

		try{
			cursor = ConnectDB.getMongoDBDataDocument("tbl_employee");
			while (cursor.hasNext()) {
				DBObject rs = cursor.next();
				EmployeeInfo empinfo = new EmployeeInfo();
				empinfo.asignemployeeName((String)rs.get("NAME") );
				empinfo.assignDepartment((String)rs.get("Department") );
				empinfo.assignSalary((double)rs.get("SALARY") );
				empinfo.assignSIN((String)rs.get("SIN"));
				empinfo.assignemployeeEduLevel((String)rs.get("EduLevel"));
				empinfo.assignemployeeAddress((String)rs.get("Address"));
				empinfo.assignemployeeJob((String)rs.get("JobTitle") );
				empinfo.assignPhone((int)rs.get("PHONENO"));
				emplist.add(empinfo);
			}
		} catch(MongoException e){
			e.printStackTrace();
		} finally{
			if (cursor != null) {
				cursor = null;
			}
		}

		return  emplist;
	}

	public void add(boolean mongodb) {
		if (mongodb) {
			AddMongoDB();
		} else {
			AddToMysql();
		}
	}

	public void update(){

	}


	private void AddToMysql(){
		ConnectDB connectDB = new ConnectDB();
		ResultSet rs = null;
;
		try {
			//`HIREDATE`,`BIRTHDATE`,

			if(this.employeeName().length()>0) {
				String sql = "INSERT INTO `core_java`.`tbl_employee` (`NAME`, `Department`, `PHONENO`, "+
				 "`JobTitle`,   `SALARY`, `COMM`, `EduLevel`, `Address`,  `SIN`)"+
				" VALUES('" + this.employeeName() + "','" + this.department() + "','" + this.employeePhone() + "'"+
				",'"+this.employeeJob()+"','"+
				",'"+this.salary()+"','"+this.employeeCommission()+"'"+
						",'"+this.employeeEduLevel()+"','"+this.employeeAddress()+"','"+this.SIN()+"')";

				System.out.println(sql);
				connectDB.directDatabaseQueryExecute(sql);
			}
			else{
				throw new Exception("Name length should be > 0");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (rs != null) {
				rs = null;
			}
		}

	}

	private void UpdateMysql() {
		ConnectDB connectDB = new ConnectDB();
		ResultSet rs = null;
		try {
			if (this.employeeName().length() > 0) {
				String sql = "UPDATE `core_java`.`tbl_employee` " +
						"SET" +
						"`NAME` = '" + this.employeeName() + "' , " +
						"`Department` = '" + this.department() + "' , " +
						"`PHONENO` = '" + this.employeePhone() + "' , " +
						"`JobTitle` = '" + this.employeeJob() + "' , " +
						"`SALARY` = '" + this.salary() + "' , " +
						"`COMM` = '" + this.employeeCommission() + "' , " +
						"`EduLevel` = '" + this.employeeEduLevel() + "' , " +
						"`Address` = '" + this.employeeAddress() + "' , " +
						"`SIN` = '" + this.SIN() + "'" +
						"WHERE" +
						"`employeeid` = 'employeeid' AND ";
				connectDB.directDatabaseQueryExecute(sql);
			} else {
				throw new Exception("Name length should be > 0");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs = null;
			}
		}

	}

	private void AddMongoDB() {

		ConnectDB.connectMongoDB2();

		/*Mongodb section start*/
		DBCursor cursor = null;
		try {
			BasicDBObject doc = new BasicDBObject();
			doc.put("NAME", this.employeeName());
			doc.put("Department", this.department());
			doc.put("PHONENO", this.employeePhone());
			doc.put("JobTitle", this.employeeJob());
			doc.put("SALARY", this.salary());
			doc.put("COMM", this.employeeCommission());
			doc.put("EduLevel", this.employeeEduLevel());
			doc.put("Address", this.employeeAddress());
			doc.put("SIN", this.SIN());
			ConnectDB.insertMongoDBDataDocument("tbl_employee", doc);

		} catch (MongoException e) {
			e.printStackTrace();
		} finally {
			if (cursor != null) {
				cursor = null;
			}
		}
	}

	private void UpdateMongoDB(){
		ConnectDB.connectMongoDB2();

		/*Mongodb section start*/
		DBCursor cursor = null;
		try {

		} catch (MongoException e) {
			e.printStackTrace();
		} finally {
			if (cursor != null) {
				cursor = null;
			}
		}
	}

}

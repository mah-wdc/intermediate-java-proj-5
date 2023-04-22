/*
 * Matthew Homan
 * CMIS 242 7382
 * April 14, 2023
 * Discussion Week 5 Task
 * 
 */

public class Employee {

	//Initialize attributes
	private String name;
	private String employeeID;
	private int yearsInCompany;
	
	//Constructor
	public Employee(String name, String employeeID) {
		this.name = name;
		this.employeeID = employeeID;
	}
	
	//New constructor demonstrating overloading
	public Employee(String name, String employeeID, int yearsInCompany) {
		this.name = name;
		this.employeeID = employeeID;
		this.yearsInCompany = yearsInCompany;
	}


	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	//New getters and setters for week 5
	public int getYearsInCompany() {
		return yearsInCompany;
	}
	
	public void setYearsInCompany(int yearsInCompany) {
		this.yearsInCompany = yearsInCompany;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	
	public void rollCall() {
		
		System.out.println("I am a default employee.");
		
	}
	
	public void display() {
		System.out.println("\nFull-time Employee\n[Name = " + this.getName() + "\nEmployee ID = " 
				+ this.getEmployeeID() + "\nYears in Company = " + yearsInCompany + " years]");
	}
	
}

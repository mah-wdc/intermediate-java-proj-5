/*
 * Matthew Homan
 * CMIS 242 7382
 * April 14, 2023
 * Discussion Week 5 Task
 * 
 */

public class Intern extends Employee{

	//Initialize attributes
	private double dailyStipend;

	//Constructor
	public Intern(String name, String employeeID, double dailyStipend) {
		super(name, employeeID);
		this.dailyStipend = dailyStipend;
	}

	//Getters and Setters
	public double getDailyStipend() {
		return dailyStipend;
	}

	public void setDailyStipend(double dailyStipend) {
		this.dailyStipend = dailyStipend;
	}
	
	//Display employee
	public void display() {
		System.out.println("\nIntern Employee\n[Name = " + this.getName() + "\nEmployee ID = " + this.getEmployeeID() + "\nDaily Stipend = $" + dailyStipend + " per day]");
	}
	
	public void rollCall() {
		
		System.out.println("I am neither a full-time nor a part-time employee. I am an intern.");
		
	}
	
}

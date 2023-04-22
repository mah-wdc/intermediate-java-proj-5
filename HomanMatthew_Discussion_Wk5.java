/*
 * Matthew Homan
 * CMIS 242 7382
 * April 14, 2023
 * Discussion Week 5 Task
 * 
 * Create a Java class with two subclasses (children). Each class should have at least 
 * one attribute and a method. Parent class should have the attribute/method that is common 
 * to both children and children should have the attribute/method that is unique to what 
 * they represent. Write the main method to demonstrate the correct functionality of the 
 * code and to demonstrate that the children inherit from the parent class. 
 * 
 * UPDATE WEEK 5
 * 
 * Use the Java hierarchy you posted in Week 3 (corrected based on any feedback you may have 
 * received) add one overriding method and one overloading. The main method should create an 
 * instance of the class and demonstrate the correct functionality of the overriding and 
 * overloading methods. 
 * 
 */

public class HomanMatthew_Discussion_Wk5 {
	
	public static void main(String[] args) {

		//Create an object of each type of Employee
		FullTime fullTime1 = new FullTime("John Hamm", "001F", 134000);
		PartTime partTime1 = new PartTime("Ben Afflect", "001P", 150);
		Intern intern1 = new Intern("Pat Sajac", "001I", 275);
		
		//Print each type of employee
		fullTime1.display();
		partTime1.display();
		intern1.display();
		
		//Spacing
		System.out.println();
		
		//Demonstrates overriding
		
		Employee employee1 = new Employee("Over", "Riding", 25);
		
		employee1.rollCall();
		fullTime1.rollCall();
		partTime1.rollCall();
		intern1.rollCall();
		
		//Demonstrates overloading
		employee1.display();
		
	}

}

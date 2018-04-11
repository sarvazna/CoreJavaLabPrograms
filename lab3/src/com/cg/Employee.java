package com.cg;

public class Employee {
		
		private String firstName; 
		private String lastName; 
		private double salary;
		Date doj;
		private String grade;
		static int count; 
		private int id;

			
			// Default constructor
			
			public Employee(){
				System.out.println("inside default constructor");
				firstName = "NA"; 
				lastName = "NA"; 
				id = ++count; 
				salary = 0;
				grade = "NA"; 
				doj=null;
			}
			
			// parameterized constructor
			
			public Employee(String firstName,String lastName,double salary,String grade,Date doj) {
				System.out.println("inside parameterized constructor");
				this.firstName = firstName; 
				this.lastName = lastName; 
				this.salary = salary;
				this.grade = grade; 
				this.doj = doj; 
				id = ++count; 
			}
			
			public void displayDetails(){
				System.out.print("\nid: "+ id);
				System.out.println("\nfirstname: "+ firstName);
				System.out.println("\nlastName: "+ lastName);
				System.out.println("\nsalary: "+ salary);
				System.out.println("\ngrade: "+ grade);
				System.out.println("\ndoj: "+ doj);
				
			}
		

}

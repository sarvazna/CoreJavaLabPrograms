package com.cg;

public class Entry {
	public static void main(String[] args){
		System.out.println("Employee details");
		
		//Employee e = null;
		
		Employee e = new com.cg.Employee();
		e.displayDetails();

		e = new Employee("SURESH","RAYAPUREDDY","OCT2017",15000);
		e.displayDetails();

		e = new Employee("sarvazna","aditya","sep2017",15000);
		e.displayDetails();

		e = new Employee("lohit","tripurari","sep2017",15000);
		e.displayDetails();
	}
}

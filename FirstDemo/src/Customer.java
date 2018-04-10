package com.cg;

public class Customer{
	
	private String name;
	private int pinCode;
	
	// Default constructor
	
	public Customer(){
		System.out.println("inside default constructor");
		name = "NA";
		pinCode = 1000;
	}
	
	// parameterized constructor
	
	public Customer(String nm, int pinCode){
		System.out.println("inside parameterized constructor");
		this.name = nm;
		this.pinCode = pinCode;
	}
	
	public void displayDetails(){
		System.out.print("Name: "+ name);
		System.out.println("\tPinCode: "+ pinCode);
	}
	
	
	
	
	
	
	public Invoice[] getInvoices(){
		return null;
	}
	
	
}

class Invoice{
	
}









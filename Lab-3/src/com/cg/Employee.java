package com.cg;

public class Employee
{ 
private String firstName; 
private String lastName; 
private double salary;
static int count; 
private int id;
public Date doj2;


public Employee() 
{ 
System.out.println("inside default constructor");
firstName = "NA"; 
lastName = "NA"; 
id = ++count; 
salary = 0; 
doj2 = null; 
} 
 
public Employee(String firstName,String lastName,Date doj,double salary) 
{ 
System.out.println("inside parameterized constructor");
this.firstName = firstName; 
this.lastName = lastName; 
this.salary = salary; 
id = ++count; 
System.out.println(doj2+" "+doj);
this.doj2 = doj;
} 

public static void main(String[] args){
  Employee e = null;
		Date d = new Date();
		
		e = new Employee();
		e.displayDetails();
		
		
		d = new Date("13-09-2017");
		e = new Employee("sarvazna","aditya",d,15000);
		 
		e.displayDetails();
		//d.displayDate();
		/*e = new Employee("sarvazna","aditya",d,15000);
		d = new Date("13-09-2017");
		e.displayDetails();
		//d.displayDate();
		e = new Employee("sarvazna","aditya",d,15000);
		d = new Date("13-09-2017");
		e.displayDetails();
		//d.displayDate();
		e = new Employee("sarvazna","aditya",d,15000);
		d = new Date("13-09-2017");
		e.displayDetails();
		//d.displayDate();*/
}
public void displayDetails(){
		System.out.print("\nid "+ id);
		System.out.println("\nfirstname "+ firstName);
		System.out.println("\nlastName "+ lastName);
		System.out.println("\ndoj "+ doj2);
		System.out.println("\nsalary "+ salary);
	}
}
class Date
{
	public String doj1;
	public Date()
	{
		
	}
	public Date(String doj)
	{

		this.doj1 = doj;
	}
	public void displayDate()
	{
		System.out.println("\ndoj "+ doj1);
	}
}
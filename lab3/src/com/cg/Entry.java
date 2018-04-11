package com.cg;

public class Entry {
		
		
		public static void main(String[] args){
			System.out.println("Employee details");
			
			Employee e = null;
			Date d=null;
			e = new Employee();
			e.displayDetails();
			 d=new Date(13,9,2017);
			e = new Employee("Sarvazna","Madduri",20000,"A",d);
			e.displayDetails();
//			d.Date(22,10,2016);
		/*	d=new Date(13,9,2017);
			e = new Employee("Sarvazna","Madduri",20000,"A",d);
		       e.displayDetails();
		       d=new Date(13,9,2017);
		       e = new Employee("Sarvazna","Madduri",20000,"A",d);
			e.displayDetails();
			d=new Date(13,9,2017);
			e = new Employee("Sarvazna","Madduri",20000,"A",d);
			e.displayDetails();*/
			
			
			
		}
		
		

}

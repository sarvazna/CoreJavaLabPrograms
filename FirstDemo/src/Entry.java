package com.cg.test;
//import java.lang.*;	// this package is imported by default

import static java.lang.System.out;
//import java.lang.String;

import java.util.Date;	// single type import
import java.util.*;		// type import on demand	

import java.sql.*;

import com.cg.Customer;


class String{
	
}

class Entry{

	public static void main(java.lang.String[] args){
		
		Date dt = new Date();
		out.println("Current date: "+ dt);
		
//		out.println("Hello, world!");
		java.lang.System.out.println("Hello, world!");
//		com.cg.Customer c = null;
		Customer c = null;
		
		c = new com.cg.Customer();
		c.displayDetails();

		c = new com.cg.Customer("RAJ",412101);
		c.displayDetails();
		
		c.getInvoices();
		
	}
	
	
}








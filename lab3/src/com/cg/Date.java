package com.cg;

public class Date {
				 
		private int day; 
		private int month;
		private int year;		
		public  Date(int date,int month,int year){
				this.day=date;
				this.month=month;
				this.year=year;	
			}
			public String toString() {
		        return String.format(day + "-" + month + "-" +year);
			}
		
}

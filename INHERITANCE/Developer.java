package com.codegnan.INHERITANCE;

public class Developer extends Employee{
	String plang;
	public Developer(String name,double salary,String plang) {
		this.name =name;
		this.salary =salary;
		this.plang =plang;
		
	}
	public void displayDeveloperDetails() {
		System.out.println("Developer Details");
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Programming Language: "+plang);
		
	}

}

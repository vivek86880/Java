package com.codegnan.INHERITANCE;

public class Manager extends Employee{
	String department;
	
	public Manager(String name,double salary,String department) {
		this.name=name;
		this.salary=salary;
		this.department=department;
		
	}
	public void displayManagerDetails() {
		System.out.println("Manager Details");
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Department: "+department);
	}

}

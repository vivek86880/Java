package com.codegnan.IOStreams;

import java.io.Serializable;

public class Employee implements Serializable{
	transient int empid;
	String empname;
	double empsal;
	String empLocation;
	
	
	public Employee(int empid, String empname, double empsal, String empLocation) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.empLocation = empLocation;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Employee ID: "+empid);
		System.out.println("Employee Name: "+empname);
		System.out.println("Employee Salary: "+empsal);
		System.out.println("Employee Location: "+empLocation);
		
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", empLocation="
				+ empLocation + "]";
	}
	
	}
	
	


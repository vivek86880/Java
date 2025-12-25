package com.codegnan.INHERITANCE;

import java.util.Scanner;

public class EmployeeInfo extends Employye{
	double salaryperyear;
	public EmployeeInfo() {
		super("","",0);
	}
	public void inputEmployeeDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		employeeName=sc.nextLine();
		System.out.println("employee Designation: ");
		Designation=sc.next();
		System.out.println("Enter Years of Experience:");
		year=sc.nextInt();	
		System.out.println("Salary per Year: ");
		salaryperyear=sc.nextDouble();
		}
	public void displayEmployeeinfo() {
		System.out.println("Name : "+employeeName);
		System.out.println("Designation : "+Designation);
		System.out.println("Years of Experience : "+year);
	}
	public void calculateslary() {
		double salary=salaryperyear*year;
		System.out.println("Salary years : "+salary);
	}

}

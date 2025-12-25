package com.codegnan.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class AllcustomSetExamples {

	public static void main(String[] args) {
		TreeSet<Employee> employeeList1=new TreeSet<Employee>(new EmployeeComparator());
		employeeList1.add(new Employee(111,"Malli",65000,"Hyderabad"));
		employeeList1.add(new Employee(100,"Mani",35000,"Banglore"));
		employeeList1.add(new Employee(1,"Mahesh",55000,"Pune"));
		employeeList1.add(new Employee(000,"Anil",25300,"Mumbai"));
		employeeList1.add(new Employee(120,"Arvi",35700,"Patna"));
		for(Employee list1:employeeList1) {
			System.out.println(list1);
		}

	}

}

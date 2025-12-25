package com.codegnan.collections;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2) {
		return e1.getDepartment().compareTo(e2.getDepartment());
		//return Integer.compare(e1.getId(), e2.getId());
		//return -Double.compare(e1.getSalary(), e2.getSalary());
		
		
	}

}

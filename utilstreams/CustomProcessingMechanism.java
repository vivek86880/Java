package com.codegnan.utilstreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomProcessingMechanism {

	public static void main(String[] args) {
		List<Employee>employees=Arrays.asList(new Employee(101,"Vivek",55000,"IT"),
				new Employee(102,"Ravi",35000,"HR"),
				new Employee(103,"Priya",60000,"Finance"),
				new Employee(104,"Deepa",42000,"IT"),
				new Employee(105,"Anil",28000,"Admin"));
		List<Employee>highEarners=employees.stream().filter(e->e.salary>40000).collect(Collectors.toList());
		System.out.println("Employees salary above 40000: "+highEarners);
		
		List<Employee>ITDep=employees.stream().filter(e->e.department.equals("IT")).collect(Collectors.toList());
		System.out.println("Employees in IT department: "+ITDep);
		
		System.out.println("Employees count in IT department: "+employees.stream().filter(e->e.department.equalsIgnoreCase("IT")).count());
		
		List<Employee>sortedEmp=employees.stream().sorted(Comparator.comparingDouble(e->e.salary)).collect(Collectors.toList());
		System.out.println("Sorted Employees based on slalry: "+sortedEmp);
		0  
		System.out.println("Employees in Descending order based on salary");
		List<Employee>DescsortedEmp=employees.stream().sorted((e1,e2)->-Double.compare(e1.salary, e2.salary)).collect(Collectors.toList());
		System.out.println("Descending Employees based on slalry: "+DescsortedEmp);
	}

}

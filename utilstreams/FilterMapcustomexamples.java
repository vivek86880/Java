package com.codegnan.utilstreams;

import java.util.Arrays;
import java.util.List;

public class FilterMapcustomexamples {

	public static void main(String[] args) {
		List<Employee>employees=Arrays.asList(new Employee(101,"Ravi",55000,"IT"),
				new Employee(102,"Priya",35000,"HR"),
				new Employee(103,"Arjun",60000,"Finance"),
				new Employee(104,"Deepa",42000,"IT"),
				new Employee(105,"Anil",28000,"Admin"));
		System.out.println("Employees salary gerater than 40000:");
		employees.stream().filter(e->e.salary>40000).
		forEach(System.out::println);
		
		//2.Employees from it department
		//3.Employees whose name start with A
		System.out.println("Names start with A");
		
		
		//4.employees not from HR department
		
		//MAP method
		//Display only employee names
		System.out.println("Only Names:");
		employees.stream().map(e->e.name).
		forEach(System.out::println);
		//print salary after adding 10% increment
		//Display name and name length

	}

}

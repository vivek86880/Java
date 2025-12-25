package com.codegnan.utilstreams;

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class FilterMapExamples {

	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(10,25,30,45,50,75,100);
		List<String>names=Arrays.asList("Ravi","Priya","Arjun","Deepa","Anil","Bhavana");
		
		System.out.println("Numbers greater than 40:");
		numbers.stream().filter(n->n>40).forEach(System.out::println);
		System.out.println("Names starting with A:");
		names.stream().filter(name->name.startsWith("A")).
		forEach(System.out::println);
		
		System.out.println("Numbers having more than 4 characters");
		names.stream().
		filter(name->name.length()>4).forEach(System.out::println);
		
		System.out.println("Convert to Uppercase");
		names.stream().map(s->s.toUpperCase()).
		forEach(System.out::println);
		
		System.out.println("Length of each name:");
		names.stream().map(name->name.length()).
		forEach(System.out::println);
		
		System.out.println("Add 10 to each Number:");
		numbers.stream().map(i->i+10).
		forEach(System.out::println);
		
		System.out.println("Welcome Message");
		names.stream().map(name->"Hello "+name).
		forEach(System.out::println);
		
		
		
//		Stream<Integer>s=numbers.stream();
//		Stream<Integer>moreThan40=s.filter(n->n>40);
//		moreThan40.forEach(System.out::println);
	}

}
//Filter
//1.Numbers greater than 40.
//2.names starting with A.
//3.names having more than 4 characters.
//4.count numbers divisible by 5.
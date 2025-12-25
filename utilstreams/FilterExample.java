package com.codegnan.utilstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterExample {

	public static void main(String[] args) {
		List<Integer>numbers=new ArrayList<>();
		for(int i=0;i<=10;i++) {
			numbers.add(i);
		}
		System.out.println(numbers);
		
		Stream<Integer> s=numbers.stream();
		
		Stream<Integer> multiplyTwo=s.map(i->i*2);
		multiplyTwo.forEach(System.out::println);
		
		//Filter Method
//		Stream<Integer>s=numbers.stream();
//		Stream<Integer>evenNumbers=s.filter(i->i%2==0);
//		//System.out.println(evenNumbers);
//		evenNumbers.forEach(System.out::println);
	}

}

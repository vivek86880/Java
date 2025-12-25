package com.codegnan.utilstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingMechainsmExample {
	
public static void main(String[] args) {
	
	List<Integer>numbers=Arrays.asList(5,10,15,20,25,30,35,40,45,47,48,49,50);
	List<String>names=Arrays.asList("Ravi","Priya","Bhavana","Krishna","Vijay","sai","Arjun","Deepa");
	
	//collect
	List<Integer>evenNumbers=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
	System.out.println("Even Numbers: "+evenNumbers);
	List<Integer>OddNums=numbers.stream().filter(n->n%2!=0).collect(Collectors.toList());
	System.out.println("Odd Numbers: "+OddNums);
	
	List<Integer>Greaterthan25=numbers.stream().filter(n->n>25).collect(Collectors.toList());
	System.out.println("Numbers greater than 25 are: "+Greaterthan25);
	
	List<String>Lengthabove4=names.stream().filter(n->n.length()>4).collect(Collectors.toList());
	System.out.println("Names with length >4: "+Lengthabove4);
	
	List<String>StartwithA=names.stream().filter(n->n.startsWith("A")).collect(Collectors.toList());
	System.out.println("Names strat with A: "+StartwithA);
	
	System.out.println("/Count Examples");
	System.out.println("Count Even Numbers: "+numbers.stream().filter(n->n%2==0).count());
	
	System.out.println("Count names with length greater than 4: "+names.stream().filter(n->n.length()>4).count());
	
	
	//Sort method Examples
	System.out.println("Ascending Names: "+names.stream().sorted((s1,s2) ->s1.compareTo(s2)).collect(Collectors.toList()));
	
	System.out.println("Descending Names: "+names.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList()));
	
	System.out.println("Ascending Numbers: "+numbers.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList()));
	
	//Min and Max element
	System.out.println("Maximum Number: "+numbers.stream().min((i1,i2)->-i1.
			compareTo(i2)).get());
	System.out.println("Minimum Names: "+names.stream().max((s1,s2)->-s1.
			compareTo(s2)).get());
	
	//Stream.of
	Stream.of(10,20,30,40,50,60).filter(n->n>25).forEach(n->System.out.println(n));
	
	Stream.of("Mango","Apple","Banana","Pomogranate").sorted().forEach(n->System.out.println(n));
}
}

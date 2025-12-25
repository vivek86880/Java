package com.codegnan.Java8;

import java.util.function.BiPredicate;

public class PredicateExample {

	public static void main(String[] args) {
		/*Predicate<Integer>p=i->i>3;
		System.out.println(p.test(20));
		
		Predicate<String>ps=str->str.length()>3;
				System.out.println(ps.test("Vivek"));
				System.out.println(ps.test("ab"));
		
				Collection<String>c1=List.of();
				Collection<String>c2=List.of("Apple","Banana","Mango");
				Predicate<Collection>isEmptyCollection=c->c.isEmpty();
				System.out.println(c1.isEmpty());
				System.out.println(c2.isEmpty());*/
		BiPredicate<Integer,Integer>bi=(a,b)->(a+b)%2==0;
		System.out.println(bi.test(15, 5));
	}

}
//2.Write a predicate to check the length of String greater than 3 or not.
//3.Write a java program to check whether the collection is empty or not.
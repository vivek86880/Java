package com.codegnan.Java8;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		Function<Integer,Integer>f=i->i*i;
		System.out.println(f.apply(10));
		System.out.println(f.apply(7));
		
		Function<String,Integer>f1=s->s.length();
		System.out.println(f1.apply("Codeganan"));
		System.out.println(f1.apply("VivekVardhan"));
	}

}
//write a function to find the length of a given String.
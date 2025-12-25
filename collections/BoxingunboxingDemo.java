package com.codegnan.collections;

public class BoxingunboxingDemo {

	public static void main(String[] args) {
		int a=10;
		Integer b=a;//primitive to wrapper autoboxing
		System.out.println("Primitive Type: "+a);
		System.out.println("Wrapper Object: "+b);
		
		Double d=10.5;//Wrapper
		double x=d;//unboxing wrapper to primitive
		System.out.println("Unboxing Wrapper: "+d);
		System.out.println("Unboxing Primitive: "+x);
	}
}

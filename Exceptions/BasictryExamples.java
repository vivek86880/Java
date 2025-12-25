package com.codegnan.Exceptions;

public class BasictryExamples {

	public static void main(String[] args) {
		try {
		System.out.println("Line 1");
		int result =10/0;
		System.out.println("Line 2");
		}catch(Exception e) {
			System.out.println("Exception caught division by zero");
		}
		System.out.println("Program ends normally");
	}

}

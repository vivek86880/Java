package com.codegnan.Exceptions;

public class FinallyExample {

	public static void main(String[] args) {
		try {
			System.out.println("In try block");
			int result=10/2;
			System.out.println("Result: "+result);
		}catch(ArithmeticException e) {
			System.out.println("In catch Block");
		}finally {
			System.out.println("In finally block. This always executes.");
		}
		System.out.println("After try-catch-finally");
	}

}

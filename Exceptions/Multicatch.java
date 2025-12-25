package com.codegnan.Exceptions;

public class Multicatch {

	public static void main(String[] args) {
		try {
			int[] numbers= {1,2,3};
			int index=numbers[5];
			int result=10/0;
			String text=null;
			int length=text.length();		
			}catch(ArrayIndexOutOfBoundsException e ) {
				System.out.println("Array index Error: "+e.getMessage());
			}catch(ArithmeticException e) {
				System.out.println("Arithemetic Exception: "+e.getMessage());
			}catch(NullPointerException e) {
				System.out.println("Null pointer Exception");
			}
		
	}

}

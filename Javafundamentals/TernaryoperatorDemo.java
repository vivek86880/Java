package com.codegnan.Javafundamentals;

import java.util.Scanner;

public class TernaryoperatorDemo {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
System.out.println("Enter your age:");
int age = scanner.nextInt();
String result= age >= 18?"Major":"Minor";
System.out.println(result);
scanner.close();
	}

}//eligible to vote or not
//positive or negative
//even or odd
//leap year or not
//greater of two numbers
//student pass or fail
//number divisible by both 3 and 5
//your shopping bill is more than 1000 apply 10% discount


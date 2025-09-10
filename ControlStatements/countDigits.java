package com.codegnan.ControlStatements;

import java.util.Scanner;

public class countDigits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int number=sc.nextInt();
		int count=0;
		while(number!=0) {//1!=0
			number/=10;
			count++;
		}
		System.out.println("The count of Digits in a Given Number is: "+count);
		
			
			
		}
		
	}
//palindrome number
//Amstrong Number
//fibonacii series

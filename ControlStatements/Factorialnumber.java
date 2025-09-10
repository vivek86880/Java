package com.codegnan.ControlStatements;

import java.util.Scanner;

public class Factorialnumber {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number to factorail:");
	int number=scanner.nextInt();
	int result=1;
	for(int i=1;i<=number;i++) {
		result=result*i;
	}
	System.out.println("Factorial of "+number+" is: "+result);
	
}
}

package com.codegnan.Javafundamentals;

import java.util.Scanner;

public class AgeClassification {

	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter the Age:");
	int Age =scanner.nextInt();
	String Classification= (Age<=12)?"Child"
		:(Age>12 && Age<=19)?"Teenager"
			:(Age>=20 && Age<=64)?"Adult"
				:"Older";
	System.out.println("Age is:"+Age+ " Classification is:"+ Classification);
	scanner.close();
	

	}

}

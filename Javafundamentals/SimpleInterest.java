package com.codegnan.Javafundamentals;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle amount:");
		int principle = sc.nextInt();
		System.out.println("Enter rate:");
		int rate = sc.nextInt();
		System.out.println("Enter the time period:");
		int time = sc.nextInt();
		int SimpleInterest = principle * rate * time / 100;
		System.out.println("SimpleInterest is:" + SimpleInterest);
		int TotalAmount = principle + SimpleInterest;
		System.out.println("Total Amount is:"+ TotalAmount);
		
		sc.close();

	}

}

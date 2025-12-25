package com.codegnan.Javafundamentals;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the principle: ");
		int principle = sc.nextInt();
		System.out.println("Enter the rate:");
		int rate = sc.nextInt();
		System.out.println("Enter the time:");
		int time = sc.nextInt();
		System.out.println("NO.of times interest is compounded per year");
		int n = sc.nextInt();
		//System.out.println("Total: ");
		double amount = principle*(1+(rate/n))^(n*time);
		double CompoundInterest = amount - principle;
		System.out.println("Compound Interest:" + CompoundInterest);
		System.out.println("Total amount is:" + amount);
		sc.close();

	}

}

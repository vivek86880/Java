package com.codegnan.Javafundamentals;

import java.util.Scanner;

public class inxomeTaxCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the salary:");
		int salary = scanner.nextInt();
		double Taxrate = salary <= 300000 ? salary * 0.05
				: salary > 300000 && salary <= 1000000 ? (300000 * 0.05) + (salary - 300000) * 0.10
						: salary > 1000000 && salary <= 2000000 ? ((300000 * 0.05) + (700000 * 0.10) + (salary - 1000000) * 0.15)
								: ((300000 * 0.05) + (700000 * 0.10) + (salary - 1000000) * 0.15) + (salary * 0.01);
		System.out.println("The total payable Tax is: "+Taxrate);

		scanner.close();

	}

}

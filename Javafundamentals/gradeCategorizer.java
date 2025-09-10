package com.codegnan.Javafundamentals;

import java.util.Scanner;

public class gradeCategorizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Marks:");
		int marks = scanner.nextInt();
		char grade = marks >= 90 ? 'O'
				: (marks >= 80) ? 'S'
						: (marks >= 70) ? 'A' : (marks >= 60) ? 'B' : (marks >= 50) ? 'C' : (marks > 35) ? 'd' : 'F';
		System.out.println("Student Marks:" + marks + " grade is: " + grade);
		scanner.close();

	}

}

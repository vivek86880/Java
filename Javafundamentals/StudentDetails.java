package com.codegnan.Javafundamentals;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Student Name:");
		String sname = scanner.next();
		System.out.println("Roll Number:");
		int rno = scanner.nextInt();
		System.out.println("Age");
		int age = scanner.nextInt();
		System.out.println("Grade");
		char grade = scanner.next().charAt(0);
		System.out.println("Student Details");
		System.out.println("Name :" + sname);
		System.out.println("Roll Number :" + rno);
		System.out.println("Age :" + age);
		System.out.println("Grade :" + grade);
		scanner.close();

	}

}

package com.codegnan.Javafundamentals;
import java.util.Scanner;
public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Student Name:");
String studentname = sc.nextLine();
System.out.println("Roll Number:");
int rollnumber = sc.nextInt();
System.out.println("Age");
int age = sc.nextInt();
System.out.println("Grade");
String grade = sc.next();
System.out.println("Student Details");
System.out.println("Name:"+studentname);
System.out.println("Roll Number:"+ rollnumber);
System.out.println("Age:"+age);
System.out.println("Grade:"+grade);
sc.close();


	}

}

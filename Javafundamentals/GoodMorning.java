package com.codegnan.Javafundamentals;

import java.util.Scanner;

public class GoodMorning {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
System.out.println("Enter time in 24hour format:");
int hour = scanner.nextInt();
String greeting=(hour>=5&&hour<12)?"Good Morning":(hour>=12&&hour<17)?"Good Afternoon":(hour>=17&&hour<22)?"Good Evening":((hour>=22 && hour<=24)||(hour>=1 && hour<5))?"Good Night":"Number out of range";
String ans = hour>24?"sorry! ":"Hello ";
System.out.println(ans+greeting);
scanner.close();


	}

}

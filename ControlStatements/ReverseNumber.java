package com.codegnan.ControlStatements;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number =scanner.nextInt();
		int originalnumber = number;
		int reversednumber=0;
		while(number!=0) {
			int reminder=number%10;
			reversednumber=reversednumber*10+reminder;
			number /=10;
		}
		if(reversednumber<0) {
			reversednumber=-reversednumber;
		}
		System.out.println("Reverse of a given number is :"+originalnumber+" = "+reversednumber);
	}

}

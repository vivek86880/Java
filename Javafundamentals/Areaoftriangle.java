package com.codegnan.Javafundamentals;

import java.util.Scanner;
public class Areaoftriangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
	System.out.println("Enter base of the triangle: ");
	double base = sc.nextDouble();
	System.out.println("Enter height of the triangle: ");
	double height = sc.nextDouble();
	double area = 0.5 * base * height;
	System.out.println("Area of Triangle is: "+ area);
	sc.close();
	
		

	}

}

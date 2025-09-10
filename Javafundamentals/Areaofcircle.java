package com.codegnan.Javafundamentals;

import java.util.Scanner;

public class Areaofcircle {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter radius:");
		int radius = Sc.nextInt();
		double area = 3.14 * radius * radius;
		System.out.println("Area of circle is:" + area);
		Sc.close();

	}

}

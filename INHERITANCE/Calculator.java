package com.codegnan.INHERITANCE;

import java.util.Scanner;

public class Calculator {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	MyCalculatoin c=new MyCalculation(x,y);

	System.out.println(c.sum);
	System.out.println(c.product);

}

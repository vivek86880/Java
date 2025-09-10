package com.codegnan.ControlStatements;

import java.util.Scanner;

public class TableMultiplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number=scanner.nextInt();
		System.out.println("Multiplication Table: "+number);
			for(int i=1;i<=20;i++) {
				System.out.println(number+"Number"+i+"="+number*i);
			}
		}
		

	}


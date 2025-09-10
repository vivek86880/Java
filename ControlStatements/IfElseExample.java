package com.codegnan.ControlStatements;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double accountbalance = 50000.0;
		System.out.println("Enter withdrawl Amount:");
		double withdrawamount = scanner.nextDouble();
		if (withdrawamount <= accountbalance && withdrawamount%100==0) {
			accountbalance -= withdrawamount;
			System.out.println("Withdraw Amount :" + withdrawamount + "successfully... available balance is :"+accountbalance);
		}else {
			System.out.println("Insufficient Funds");
	scanner.close();

		}

	}

}

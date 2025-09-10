package com.codegnan.Javafundamentals;

import java.util.Scanner;

public class Farecalculator {

	public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the Distance travelled(km):");
double Distance =scanner.nextDouble();
double Fare=(Distance<=2)?50
		:(Distance<=10)?(50+(Distance-2)*15):(50+(8*15)+(Distance-10)*10);
Fare = (Distance>20)?Fare*0.95:Fare;
System.out.println("The total Fare is : "+ Fare);
scanner.close();

				


	}

}

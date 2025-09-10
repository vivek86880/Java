package com.codegnan.ControlStatements;

import java.util.Scanner;

public class CanteenSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int teaprice=10,coffeeprice=15,samosaprice=20;
		int teaQty=0,coffeeQty=0,samosaQty=0;
		int choice;
		double taxrate=0.05;
		do {
		System.out.println("Canteen Menu");
		System.out.println("1.View Menu");
		System.out.println("2.Order Items");
		System.out.println("3.View Bill");
		System.out.println("4.Chexkout and Exit");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Menu");
			System.out.println("1.Tea- $"+ teaprice);
			System.out.println("2.Coffee- $"+ coffeeprice);
			System.out.println("3.Samosa- $"+samosaprice);
			break;
		case 2:
			System.out.println("Enter Item Number to Order(1-3");
			int item=sc.nextInt();
			System.out.println("Enter Quantity");
			int qty=sc.nextInt();
			if(qty<=0) {
				System.out.println("Quantity mst be greater than 0");
				break;
			}
			switch(item) {
			case 1:
				teaQty+=qty;
				System.out.println(qty+"Tea(s) Added");
				break;
			case 2:
				coffeeQty+=qty;
				System.out.println(qty+"Cofee(s) Added");
				break;
			case 3:
				samosaQty+=qty;
				System.out.println(qty+"Samosa(s) Added");
				break;
			default:
				System.out.println("Invalid Item Number."+"Please choose between 1=3");
				break;
			}
			break;
		case 3:
			int teatotal=teaQty*teaprice;
			int coffeetotal=coffeeQty*coffeeprice;
			int samosatotal=samosaQty*samosaprice;
			int subtotal=teatotal+coffeetotal+samosatotal;
			double tax=taxrate *subtotal;
			double grandtotal=subtotal+tax;
			System.out.println(".....BILL....");
			if(teaQty>0) {
				System.out.println("Tea x :"+teaQty+"=$"+teatotal);
			}
			if(coffeeQty>0) {
				System.out.println("Coffee x :"+coffeeQty+"=$"+coffeetotal);
			}
			if(samosaQty>0) {
				System.out.println("Samosa x :"+samosaQty+"=$"+samosatotal);
			}
				if(subtotal==0) {
					System.out.println("No Items Ordered Yet");
				}else {
					System.out.println("subtotal:"+ subtotal);
					System.out.println("Tax(5%):"+ tax);
					System.out.println("Total:"+ grandtotal);
					
			}
			break;
		case 4:
			System.out.println("ThankYou for Exiting the System");
			break;
			default:
				System.out.println("Invalid Choice"+"Please enter a number between 1 to 4");
				break;
		
		}
	
		} 
		while(choice!=4);
		sc.close();
	}
}

		
	


	



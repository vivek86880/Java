package com.codegnan.ControlStatements;

import java.util.Scanner;


public class ATMExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double balance = 50000;//initial acc balance
		int pin =1234;//original pin
		int enteredpin;
		System.out.println("Enter your pin..");
		enteredpin =scanner.nextInt();
		if(enteredpin!=pin) {
			System.out.println("Incorrect pin.Exiting");
			return;
		}
		int choice;
		do {
			
		
		System.out.println("||===============||");
		System.out.println("||===========ATM MENU==========||");
		System.out.println("||=========1.Check Balance========||");
		System.out.println("||=========2.Deposit========||");
		System.out.println("||=========3.Withdrawl========||");
		System.out.println("||=========4.Exit========||");
		System.out.println("Enter your choice :");
		
		choice =scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Your Balance is : "+ balance);
			break;
			
		case 2:
			System.out.println("Enter Deposit Amount : ");
			double depositamount =scanner.nextDouble();
			if(depositamount%100!=0) {
				System.out.println("Please Deposit multiples of 100 like"+"[700,1000,1200]");
			}else {
				if(depositamount<500) {
					System.out.println("Please deposit more than 500 rupees");
				}else{
					balance += depositamount;
					System.out.println("Deposited $"+depositamount+"Amount successfully..."+"New Balance is: "+balance);
					
				}
			}
			break;
		case 3:
			System.out.println("Enter Withdrawl Amout: ");
			double withdrawamount=scanner.nextDouble();
			if(withdrawamount%100!=0) {
				System.out.println("Please Withdraw multiples of hundred like 700,1000");
			}else {
				if(withdrawamount>balance) {
					System.out.println("Insufficient Funds");
				}else {
					balance-=withdrawamount;
					System.out.println("Amount Withdrawn Successfully"+withdrawamount+"Updated Balance is: "+balance);
			
		}
			}
		break;
		case 4:
			System.out.println("Exiting... ThankYou for using the ATM");
			break;
		default:
			System.out.println("Invalid choice"+"Please choose a valod option[1-4]");
			break;
		}
	} while(choice!=4);
	
		
		}
		}
		

	



package com.codegnan.ControlStatements;

import java.util.Scanner;

public class wendingMachine {

	public static void main(String[] args) {
		int choice;
		Scanner scanner=new Scanner(System.in);
		System.out.println("WELCOME TO THE WENDING MACHINE");
		System.out.println("MENU");
		System.out.println("1.COCO COLA");
		System.out.println("2.THUMBSUP");
		System.out.println("3.SPRITE");
		System.out.println("4.MOUNTAIN DEW");
		System.out.println("5.STING");
		System.out.println("6.MONSTER");
		System.out.println("7.LIMCA");
		System.out.println("8.MIRINDA");
		System.out.println("9.MAAZA");
		System.out.println("10.7UP");
		System.out.println("11.EXIT");
		do {
		System.out.println("ENTER YOUR CHOICE(1-11):");
		choice = scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("YOU HAVE SELECTED COCO COLA.ENJOY YOUR DRINK");
			break;
		case 2:
			System.out.println("YOU HAVE SELECTED THUMBSUP.ENJOY YOUR DRINK");
			break;
			case 3:
				System.out.println("YOU HAVE SELECTED SPRITE.ENJOY YOUR DRINK");
				break;
			case 4:
				System.out.println("YOU HAVE SELECTED MOUNTAIN DEW.ENJOY YOUR DRINK");
				break;
			case 5:
				System.out.println("YOU HAVE SELECTED STING.ENJOY YOUR DRINK");
				break;
			case 6:
				System.out.println("YOU HAVE SELECTED MONSTER.ENJOY YOUR DRINK");
				break;
			case 7:
				System.out.println("YOU HAVE SELECTED LIMCA.ENJOY YOUR DRINK");
				break;
			case 8:
				System.out.println("YOU HAVE SELECTED MIRINDA.ENJOY YOUR DRINK");
				break;
			case 9:
				System.out.println("YOU HAVE SELETED MAAZA");
				break;
			case 10:
				System.out.println("YOU HAVE SELECTED 7UP.ENJOY YOUR DRINK");
				break;
			case 11:
				System.out.println("THANKYOU FOR USING THE VENDING MACHINE.HAVE A NICE DAY");
				break;
				
				default:
					System.out.println("INVALID CHOICE ENTER AN VALID OPTION");
					break;
		}
		System.out.println();//BLANK LINE FOR BETTER READABILITY
		}while(choice!=11);
		scanner.close();
		
		
		
		

	}

}

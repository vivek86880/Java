package com.codegnan.Javafundamentals;

import java.util.Scanner;

public class ScorevalidatorCP {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Score: ");
		int score=sc.nextInt();
		boolean Status;
		//boolean valid=(score%4==0||score%6==0) ^ (score%4==0 && score%6==0)?true:false;
		if((score%4==0 || score%6==0) && !(score%4==0&& score%6==0)){
			Status=true;
		}else {
			Status=false;
		}
		System.out.println("Status is "+Status);
		sc.close();
	}
	
}

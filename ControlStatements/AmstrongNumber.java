package com.codegnan.ControlStatements;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,r,sum=0,temp;
		System.out.println("Enter a Number: ");
		n=sc.nextInt();
		temp=n;
		while(n!=0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("Amstrong Number");
		}else {
			System.out.println("Not an Amstrong Number");
			
		}
sc.close();
	}

}

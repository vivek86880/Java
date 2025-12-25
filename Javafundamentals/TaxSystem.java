package com.codegnan.Javafundamentals;

import java.util.Scanner;

public class TaxSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the income: ");
		int  income=sc.nextInt();
		System.out.println("Enter no.of Dependents: ");
		int dependents=sc.nextInt();
		int deduction=0;
//		if(income<50000) {
//			deduction=500*dependents;
//		}else {
//			if(income>=50000 &&dependents>=2) {
//				deduction=300*dependents;
//			}else {
//				deduction=0;
//			}
//		}
		int ded=income<50000?500*dependents:300*dependents;
		deduction=dependents>=2?ded:0;
		System.out.println("Total Deduction = "+deduction);
		sc.close();
	}

}

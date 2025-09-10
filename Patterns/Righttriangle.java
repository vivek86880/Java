package com.codegnan.Patterns;

public class Righttriangle {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int k=0;k<i;k++) {
				System.out.println("  ");
			}
			for(int j=0;j<5-i;j++) {
				System.out.print(" *");
				//System.out.print(j+" ");
				//System.out.print((char)(96+j)+" ");
				//System.out.print((char)(102-j)+" ");
			}
			System.out.println(" ");
		}

	}

}

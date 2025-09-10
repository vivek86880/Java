package com.codegnan.Patterns;

public class Diamondpattern {

	public static void main(String[] args) {
		//part-1 upper part of the diamond
		int rows=5;
		for(int i=1;i<=rows;i++) {
			//inner loop 1;print leading spaces
			for(int j=1;j<=rows-i;j++) {
				System.out.print("  ");//two spaces
			}
				//inner for loop 2:print stars
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		//lower part of the diamond pattern
		for(int i=rows-1;i>=1;i--) {
			//inner for loop 1:
			for(int j=1;j<=rows-i;j++) {
				System.out.print("  ");//two spaces
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("* ");
			
		}System.out.println();
		}
	}

}

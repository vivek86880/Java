package com.codegnan.ControlStatements;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the score :");
		int marks = scanner.nextInt();
		if (marks >= 90) {
			System.out.println("Grade :O");
		} else {
			if (marks >= 80) {
				System.out.println("Grade : S");
			} else {
				if (marks >= 70) {
					System.out.println("Grdae :A");
				} else {
					if (marks >= 60) {
						System.out.println("Grade :B");
					} else {
						if (marks >= 50) {
							System.out.println("Grade :B");
						} else {
							if (marks >= 40) {
								System.out.println("Grade :C");
							} else {
								if (marks >= 30) {
									System.out.println("Grade :D");
								} else {
									System.out.println("Fail");
								}
								scanner.close();
							}
						}
					}

				}
			}
		}
	}

}

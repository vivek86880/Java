package com.codegnan.Javafundamentals;

import java.util.Scanner;

public class Billingsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int total = sc.nextInt();

        // Apply discount
        double finalAmount;
        if (total > 100) {
            finalAmount = total - (total * 0.10); // 10% discount
        } else {
            finalAmount = total - (total * 0.05); // 5% discount
        }

        // Output rounded to 2 decimal places
        
        System.out.printf("%.2f", finalAmount);

        sc.close();
    }
}

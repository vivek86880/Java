package com.codegnan.Exceptions;

public class ATM {
private double balance=10000;
private final int pin=2435;
private int pinattempts=0;
public  boolean verifypin(int enteredpin) throws InvalidPinException{
	if(enteredpin==pin) {
		pinattempts=0;
		System.out.println("Access Granted");
		return true;
	}else {
		pinattempts++;
		if(pinattempts>3) {
			throw new InvalidPinException("Too Many Incorrect Attempts "+"Access Denied");
		}else {
			System.out.println("Invalid Pin. Attempts left: "+(3-pinattempts));
			return false;
		}
	}
}
}

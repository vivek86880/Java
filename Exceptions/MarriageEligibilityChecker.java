package com.codegnan.Exceptions;

public class MarriageEligibilityChecker {

	
		
		public void eligibilityChecker(int age) throws TooOldException, TooYoungException{
			if(age<18) {
				throw new TooYoungException("Marriage cannot be approved. Age is below 18years.");
			}else {
				if(age>60) {
					throw new TooOldException("Marriage cannot be approved. Your age is above 60 years");
				}else {
					System.out.println("Marriage Approved. You will"+"get the best match details through email");
				}
			}
		
		
	}
		public static void main(String[] args) {
			MarriageEligibilityChecker checker= new MarriageEligibilityChecker();
					try {
						checker.eligibilityChecker(27);
					}catch(TooYoungException| TooOldException e) {
						e.printStackTrace();
					}
		}

}


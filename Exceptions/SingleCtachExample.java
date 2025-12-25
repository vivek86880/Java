package com.codegnan.Exceptions;

public class SingleCtachExample {

	public static void main(String[] args) {
		try {
			String text=null;
			int lenth=text.length();
		}catch(NullPointerException e) {
			System.out.println("Error: trying to use a null reference");
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}

	}

}

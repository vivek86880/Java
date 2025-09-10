package com.codegnan.ControlStatements;

import java.util.Scanner;

public class AirlineTicketpricing {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int Baseprice =scanner.nextInt();
		int age =scanner.nextInt();
		String c_age = age<18?"kid":age>=18 &&age>60?"Adult":"Senoir";
		if(c_age == "kid"){
			double discount = Baseprice*0.5;
		}else {
			if(c_age == "Adult") {
				double discount = Baseprice*0.25;
			}else {
				//NO SPECIFIC DISCOUNT
			
					
				}
			
				
			}
			
			
			
		}
		
		

	}



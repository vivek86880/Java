package com.codegnan.INHERITANCE;

public class Test {
	
public static void main(String[] args) {
	Employee e1=new Manager("Vivek",60000,"Development");
	e1.displayDetails();
	Employee e2=new Developer("Vardhan",60000,"Java");
	e2.displayDetails();
	
}
}

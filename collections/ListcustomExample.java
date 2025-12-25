package com.codegnan.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ListcustomExample {
	
	public static void main(String[] args) {
		ArrayList<Student>studentList1=new ArrayList<Student>();
		
		studentList1.add(new Student (1,"vivek",22));
		studentList1.add(new Student (2,"vardhan",21));
		studentList1.add(new Student (3,"Arjun",23));
		studentList1.add(new Student (4,"Ram",21));
		studentList1.add(new Student (5,"Sai",20));
		System.out.println(studentList1);
		
		Vector<Student>studentList2=new Vector<Student>();
		
		studentList1.add(new Student (1,"vivek",22));
		studentList1.add(new Student (2,"vardhan",21));
		studentList1.add(new Student (3,"Arjun",23));
		studentList1.add(new Student (4,"Ram",21));
		studentList1.add(new Student (5,"Sai",20));
		System.out.println(studentList2);
		
		
		System.out.println("Enumeration");
		Enumeration<Student>e=studentList2.elements();
		while(e.hasMoreElements()) {
			Student s=e.nextElement();
			System.out.println(s);
		}
		
		Iterator itr=studentList1.iterator();
		while(itr.hasNext()) {
			Student s1=itr.next();
		}
	}
}

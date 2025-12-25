package com.codegnan.collections;

import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		TreeSet<String> names =new TreeSet<String>(new MyComparator());
		names.add("malli");
		names.add("Anusha");
		names.add("Mahesh");
		names.add("kumar");
		names.add("Anu");
		System.out.println(names);//Anu,Anusha,Mahesh,kumar,malli
		
		TreeSet<Integer> t=new TreeSet<Integer>(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(10);
		System.out.println(t);//0,10,15 because duplicates are not allowed in set

	}

}

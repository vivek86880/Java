package com.codegnan.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapCustomObjects {

	public static void main(String[] args) {
		HashMap<Person,Integer>h1=new HashMap<>();
		h1.put(new Person(1,"malli","malli@gmail.com"),666);
		h1.put(new Person(7,"arjun","arjun@gmail.com"),111);
		h1.put(new Person(5,"sneha","sneha@gmail.com"),000);
		h1.put(new Person(3,"mounika","mouni@gmail.com"),999);
		h1.put(new Person(8,"anusha","anu123@gmail.com"),666);
		System.out.println(h1);
		System.out.println("Printing Entries one by one");
		for(Map.Entry<Person,Integer>entry:h1.entrySet()) {
			System.out.println(entry.getKey()+----->+);
		}

	}

}

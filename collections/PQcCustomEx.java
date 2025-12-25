package com.codegnan.collections;

import java.util.PriorityQueue;

public class PQcCustomEx {
	
	public static void main(String[] args) {
		PriorityQueue<Product> productList = new Product<>(new ProductComparator);
		productList.add(new Product(111,"Phone",22000));
		productList.add(new Product(888,"Watch",2250));
		productList.add(new Product(100,"Shoe",1244.99));
		productList.add(new Product(20,"Pen",120.22));
		System.out.println(productList);
		
	}

}

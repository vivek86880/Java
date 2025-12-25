package com.codegnan.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethodsDemo {

	public static void main(String[] args) {
		Collection <String>fruits=new ArrayList<String>();
		System.out.println(".....add().....");
		fruits.add("Apple");
		fruits.add("Pineapple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Kiwi");
		System.out.println("Fruits after add(): "+fruits);
		
		System.out.println("......addAll()......");
		Collection<String>morefruits=new ArrayList<String>();
		morefruits.add("Mango");
		morefruits.add("Orange");
		morefruits.add("papaya");
		morefruits.add("Grapes");
		fruits.addAll(morefruits);
		System.out.println("Fruits after addAll(): "+fruits);
		System.out.println("......remove()......");
		fruits.remove("Banana");
		System.out.println("Fruits after remove(): "+fruits);
		
		Collection<String>removeList=new ArrayList();
		removeList.add("Mango");
		removeList.add("Cherry");
		removeList.add("papaya");
		fruits.removeAll(removeList);
		System.out.println("fruits after remove all: "+fruits);
		
		Collection<String>retainList=new ArrayList<String>();
		retainList.add("Apple");
		retainList.add("Grape");
		retainList.add("Orange");
		fruits.retainAll(retainList);
		System.out.println("After retainAll: "+fruits);
		System.out.println("......Contains......");
		System.out.println("Contains Apple?: "+fruits.contains("Apple"));
		System.out.println("Contains Pinepple?: "+fruits.contains("Pinepple"));
		
		System.out.println("......ContainsAll()......");
		Collection<String>checkList=new ArrayList<String>();
		checkList.add("Apple");
		checkList.add("Orange");
		System.out.println("After containsAll(): "+fruits.containsAll(checkList));
		
		
		System.out.println("......Size()......");
		System.out.println("Fruits Size: "+fruits.size());
		
		System.out.println("......isEmmpty()......");
		System.out.println("Fruits list is empty? "+fruits.isEmpty());
		
		System.out.println("......toArraay()......");
		Object[] fruitsArray=fruits.toArray();
		System.out.println("Fruits as Array: ");
		for(int i=0;i<fruitsArray.length;i++) {
			System.out.println(fruitsArray[i]+" ");
		}
		
		System.out.println("------iterator()------");
		Iterator<String>itr=fruits.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next()+" ");
		}
		
		System.out.println("------clear()------");
		fruits.clear();
		System.out.println("fruits after clear?"+fruits);
		System.out.println("Fruits Size: "+fruits.size());
		System.out.println("Is collection empty after clear()? "+fruits.isEmpty());	
		
		
//		fruits.add(10);
//		fruits.add(new Integer(20));
//		fruits.add(null);
		
	}

}

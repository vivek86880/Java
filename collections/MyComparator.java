package com.codegnan.collections;

import java.util.Comparator;

public class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		
		String s1=obj1.toString();
		String s2=obj2.toString();
		return -s1.compareTo(s2);
//		Integer i1=(Integer)obj1;
//		Integer i2=(Integer)obj2;
//		if(i1<i2) {//obj1<obj2 or 10<20
//			return -10;
//		}else if(i1>i2){
//			return 1;
//		}else {
//			return 0;
//		}
		//return -i1.compareTo(i2);
	}

}

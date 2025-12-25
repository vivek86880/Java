package com.codegnan.MapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapmethod {

	public static void main(String[] args) {
		Map<String,Integer>studentMarks=new HashMap<>();
		studentMarks.put("Arjun", 88);
		studentMarks.put("Ravi", 92);
		studentMarks.put("Sita", 79);
		studentMarks.put("Priya", 85);
		studentMarks.put("Rahul", 91);
		System.out.println(studentMarks);
		
		//putAll(Map m)//add new students
		Map<String,Integer>newStudents=new HashMap<>();
		newStudents.put("Ananya", 95);
		newStudents.put("Vikram", 94);
		newStudents.put("Meera", 90);
		studentMarks.putAll(newStudents);
		System.out.println(studentMarks);
		
		//get(key)
		System.out.println("Marks of Arjun: "+studentMarks.get("Arjun"));
		
		//remove(key)
		System.out.println("Removed priya's Marks: "+studentMarks.remove("Priya"));
		
		//contains(key)
		System.out.println("Is Sita present? : "+studentMarks.containsKey("Sita"));
		
		//containsValue
		System.out.println("Any student scored 100: "+studentMarks.containsValue(newStudents));
		
		//isEmpty
		System.out.println("Is Map Empty? : "+studentMarks.isEmpty());
		
		//size
		System.out.println("Total Students: "+studentMarks.size());
		
		//keySet
		//Set<String>studentNames
		//System.out.println("");
		
		Collection<Integer>marks=studentMarks.values();
		System.out.println("Marks: "+marks);
		
		//Entry Set
		Set<Map.Entry<String,Integer>>entries= studentMarks.entrySet();
		System.out.println("All Entries");
		for(Map.Entry<String,Integer>entry:entries) {
			System.out.println(entry);
		}
		
		
		

	}

}

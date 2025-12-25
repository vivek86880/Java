package com.codegnan.IOStreams;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CSVWriterExxample {

	public static void main(String[] args) {
		List<Person>people=new ArrayList<>();
		people.add(new Person("Vivek",22,"Hyderabad"));
		people.add(new Person("Vardhan",23,"Banglore"));
		people.add(new Person("Venu",21,"Vijayawada"));
		try(PrintWriter out=new PrintWriter("Person.csv")){
			out.print("name,age,city");
			out.println();
			for(Person person:people) {
				out.print(person.toCSV());
				out.println();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}

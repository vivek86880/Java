package com.codegnan.IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDeserDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		Employee emp=new Employee(101,"Vivek",60000,"Hyderabad");
		String filepath="emp.txt";
		System.out.println("Employee details before serialization: ");
		emp.displayEmployeeDetails();
		try(FileOutputStream fos=new FileOutputStream(filepath);
				ObjectOutputStream oos=new ObjectOutputStream(fos)){
			oos.writeObject(emp);
			System.out.println("Serialized Employee Object"+emp);
			System.out.println();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("De-Serialization process");
		try(FileInputStream fis=new FileInputStream(filepath);
				ObjectInputStream ois=new ObjectInputStream(fis)){
			Employee emp1=(Employee)ois.readObject();
			System.out.println("Employee details after Deserialization: ");
			emp1.displayEmployeeDetails();
			System.out.println("De-Serialized Employee object: "+emp1);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}

package com.codegnan.IOStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputStreamexample {

	public static void main(String[] args) throws IOException {
		String filepath="JFS42fos.txt";
		String content="Writing a data using fileoutput stream.\n"
				+"java programming is easy.\n When ? You make practice";
		try(FileOutputStream fos=new FileOutputStream(filepath);){
			byte[] data=content.getBytes();
			fos.write(data);
			System.out.println("File created and written using FileOutputStream");
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}

package com.codegnan.IOStreams;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {

	public static void main(String[] args) {
		String filepath="JFS42bos.txt";
		String content="Welcome to java programming lanugage.\n"
				+ "Java progarmming was developed by james gosling in 1995.\n"
				+ "Java is powerful programming language.\n"
				+ "It is stongly typed.";
		try(BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(filepath))){
			byte[] data=content.getBytes();
			bos.write(data);
			System.out.println("File created using BUfferedOutputStream");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}

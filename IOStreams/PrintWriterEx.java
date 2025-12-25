package com.codegnan.IOStreams;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx {

	public static void main(String[] args) {
		try(PrintWriter out=new PrintWriter("Output.txt")){
			out.println("Hello, This is a message written to file.");
			out.println("This is another line.");
			out.println(false);
			out.println(10.5);
			out.println('a');
			out.println(97);
			System.out.println("Data written to a file successfully");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}

package com.codegnan.IOStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new FileReader("Output.txt"))){
			String line;// or String line=br.readLine();
			while((line=br.readLine())!=null){// while((line
				System.out.println(line);
				}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}

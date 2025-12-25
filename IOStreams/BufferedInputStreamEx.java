package com.codegnan.IOStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamEx {

	public static void main(String[] args) {
		String filepath="JFS42bos.txt";
		try(BufferedInputStream bis=new BufferedInputStream
				(new FileInputStream(filepath))){
			int byteData;
			while((byteData=bis.read())!=-1) {
				System.out.print((char)(byteData));
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}

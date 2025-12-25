package com.codegnan.IOStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		String filepath="JFS42fos.txt";
		
		try(FileInputStream fis=new FileInputStream(filepath)){
			int byteData;
			while((byteData=fis.read())!=-1) {
				System.out.print((char)byteData);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}

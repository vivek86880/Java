package com.codegnan.SocketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.rmi.UnknownHostException;

public class IPFinder {

	public static void main(String[] args) throws IOException  {
//		InetAddress address;
//		try {
//			address = InetAddress.getLocalHost();
//			System.out.println("IP Address: "+address.getHostAddress());
//		} catch (UnknownHostException e) {
//			
//			e.printStackTrace();
//		}
		String name;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Host Name: ");
		name=br.readLine();
		InetAddress ad=InetAddress.getByName(name);
		System.out.println("IP of Host: "+ad);
	}

}

package com.codegnan.OOPExamples;

public class Main {

	public static void main(String[] args) {
		//object creation
		Box mybox1=new Box();
		mybox1.height=1.0;
		mybox1.depth=2.0;
		mybox1.width=3.0;
		double vol;
		vol=mybox1.height*mybox1.depth*mybox1.width;
		System.out.println("volume of box1 is:"+vol);
		
		Box mybox2=new Box();
		mybox2.height=5.0;
		mybox2.depth=2.0;
		mybox2.width=3.0;
		vol=mybox2.height*mybox2.depth*mybox2.width;
		System.out.println("volume of box2 is:"+vol);

	}

}

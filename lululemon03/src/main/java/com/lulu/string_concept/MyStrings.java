package com.lulu.string_concept;

import java.util.Scanner;

//import java.lang.String; //by deault imported


public class MyStrings {

	String info="I m first String"; // Instance Variable
	static int no;
	// Instance Varuiable + static = > static or class variable

	void process() {
		
		
	
		String data; // Local Variable
		
		//I / O family 
		
		Scanner sc= new Scanner( System.in);
		System.out.println("Hey user eneter 1 String !!!!!");
		data= sc.next();
		
		System.out.println("I got data as = "+data);
		System.out.println("I got info as ="+info );

	}

}


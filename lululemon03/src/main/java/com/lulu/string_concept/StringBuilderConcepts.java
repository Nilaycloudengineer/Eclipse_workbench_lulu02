package com.lulu.string_concept;

 

public class StringBuilderConcepts {

 

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		StringBuilder sb= new StringBuilder();

 

		System.out.println(sb.capacity());//16

 

		sb.append("Hey All");

 

		sb.append(" How you all Doing ..!");

 

		

 

		System.out.println(sb);

 

		System.out.println(sb.capacity());

 

		System.out.println(sb.length());

		

		//3 more methods

		System.out.println(sb.substring(2, 6));

		System.out.println(sb.reverse());

		System.out.println(sb.charAt(5));

 

	}

 

}
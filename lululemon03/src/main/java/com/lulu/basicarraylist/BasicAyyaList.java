package com.lulu.basicarraylist;

import java.util.ArrayList;



public class BasicAyyaList {

 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String is Objject
		//Employye as Objects
		//Account as object

		//Apple- Object

		//Basket - Collection  can only Accept (Apple --String)
		ArrayList<String> bucketString= new ArrayList<String>();
		bucketString.add("sahana");
		bucketString.add("Ajith");
		bucketString.add("Harini");
		bucketString.add("Meghana");
		bucketString.add("Apoorva");


		//Processing
		System.out.println(bucketString);
		System.out.println(bucketString.get(0));
		System.out.println(bucketString.get(1));
		System.out.println(bucketString.isEmpty());
		System.out.println(bucketString.set(2, "Lulu"));
		

		//any 3 pre defined 
        System.out.println(bucketString.remove("sahana"));
        System.out.println(bucketString.remove(3));
        System.out.println(bucketString.inde);
        System.out.println(bucketString);




 

	}

 

}
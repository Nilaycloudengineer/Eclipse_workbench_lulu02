package com.lulu.datastructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

 

public class MySets {

 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Sets..They don't allow duplicates!



//		HashSet<String> bucketString= new HashSet<String>();//Insertions Orders not maintained
//		LinkedHashSet<String> bucketString= new LinkedHashSet<String>();//Insertion Order is Maintained
		TreeSet<String> bucketString= new TreeSet<String>();//As 	Alphabet order it arranges
		                                                    //

 

		bucketString.add("sahana");
		bucketString.add("Ajith");
		bucketString.add("Harini");
//		bucketString.add(null);  //java.lang.NullPointerException
		bucketString.add("Meghana");
		bucketString.add("Apoorva");
		bucketString.add("Harini");
		bucketString.add("Amit");

		System.out.println(bucketString.size());
		System.out.println(bucketString);










		//looping or for o r iteration
	Iterator<String> iterator = bucketString.iterator();
//	iterator.hasNext();
//	iterator.next()
//	System.out.println(iterator.hasNext());
//	System.out.println(iterator.next());
//	System.out.println(iterator.next());
//	System.out.println(iterator.next());
//	System.out.println(iterator.next());








//              true 
		while(iterator.hasNext()) {
		   // String element = iterator.next();
		    System.out.println( iterator.next() );
		}

 

	}

 

}
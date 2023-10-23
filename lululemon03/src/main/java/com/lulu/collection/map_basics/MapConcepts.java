package com.lulu.collection.map_basics;

import java.util.Map.Entry;
import java.util.TreeMap;

 

public class MapConcepts {

 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Key  Value Pair
		//Two Objects needed K -V
//		Map<k,V>
		//add() not there , put() will help to add elements
		//duplicate Keys not allowed

//		Hashtable<Integer, String> bucketMap= new Hashtable<Integer,String>();//can t take K and V as null
		//HashMap<Integer, String> bucketMap= new HashMap<Integer,String>(); //takes the null k and v
		TreeMap<Integer, String> bucketMap= new TreeMap<Integer,String>();//sorting is done ,null as value is Ok
		                                                                  // K can t be Null
		//LinkedHashMap<K, V>
		bucketMap.put(111, "Sahana");
		bucketMap.put(222, "Meghana");
		bucketMap.put(333, "Apoorva");
		bucketMap.put(444, "Ajith");
		//bucketMap.put(null, "Shravya");
		bucketMap.put(876, null);
//		bucketMap.put(null, "Nagasree");//

		System.out.println(bucketMap.size());
		System.out.println(bucketMap.get(222));
		System.out.println(bucketMap.firstEntry());
		System.out.println(bucketMap.entrySet());
		System.out.println("Individual Entries:");
		/////////////////////////////////// Lets create Entry to Iterate Over/////
		for(Entry<Integer, String> entrys : bucketMap.entrySet() ) {
			//System.out.println(entrys);
			System.out.println(entrys.getKey()  +" :::"+entrys.getValue());
			if(entrys.getKey()==222) {
				System.out.println("Congratulations "+entrys.getValue()) ;
			}

		}





	}

 

}
package com.lulu.string_concept;

public class StringBufferbasic {

 

	public static void main(String[] args) {

		// TODO Auto-generated method stub


		StringBuffer sbf= new StringBuffer();

		sbf.append("My ");

		sbf.append("Name ");

		sbf.append("is ");

		sbf.append("Amit ");

        System.out.println(sbf.capacity());
        //stringBuffer Grows Dynamically
        System.out.println(sbf);
        System.out.println(sbf.hashCode());
        //Object Class is super supreme class for all the files
        
        System.out.println(sbf.length());
        System.out.println(sbf.delete(0, 10));
        
        System.out.println(sbf.reverse());  
         
        System.out.println(sbf.replace(3,4, "Nilay"));  
        
        System.out.println(sbf.insert(3, "King "));
        
	}

 

}

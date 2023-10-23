package com.lulu.oop_finalkey;
//final class cant be extended...
final public class Product {
	
	
	final int price=200;  // final variables must be iniatialied
	String name;
	
	//if method is final it cant be overridden ....
	 void addProd() {
	//	price=500;  // Not Valid 
		
System.out.println("Price of Product is "+ price);
		
	}

}

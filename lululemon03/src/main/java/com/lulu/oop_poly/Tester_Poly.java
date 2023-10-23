package com.lulu.oop_poly;

public class Tester_Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        Addition additionObj = new Addition();

	        // Calling the void add() method
	        additionObj.add();

	        // Calling the int add(int no1, int no2) method
	        int sumInt = additionObj.add(5, 10);
	        System.out.println("Sum of two integers: " + sumInt);

	        // Calling the float add(int no1, float no2) method
	        float sumFloat = additionObj.add(7, 5.5f);
	        System.out.println("Sum of an integer and a float: " + sumFloat);
	    }
	
	}

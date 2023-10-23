package com.voter.eligibility;

public class TesterCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//object must be created
		Calculator cal= new Calculator();
		//access the feature variable or Methods
		int add=cal.add(20, 10); // calling Method
		System.out.println("Addition res ="+ add);
		
		int subres=cal.sub(200, 10); // calling Method
		System.out.println("Substraction res ="+ subres);
		
			
		
	}

}


package com.lulu.operators;
import java.math.BigDecimal;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable
		//data types
		//Operators
		
		double SI; // need to calculated
		int N =20;
		float R=8.5f;
		float P=4000000;
		
		SI =P*N*R/100;
		
		System.out.println("SI charged ="+ SI);
		double Total = SI +P;
		//System.out.println("Total pay Amount charged ="+ Total);
	
		
		System.out.println();
		
		@SuppressWarnings("deprecation")
		Double bd = (double) Total;
		System.out.println("Total Amount is ="+ bd.longValue());
		
		
		

	}

}


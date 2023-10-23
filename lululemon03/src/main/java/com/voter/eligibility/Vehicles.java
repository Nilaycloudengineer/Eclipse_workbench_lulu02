package com.voter.eligibility;

public class Vehicles {
	int model;
	String brand;
	int speed;

	void start(){
		System.out.println("I will start Engine");

	}

	void stop(){
		System.out.println("I will Stop Vehicle");

	}

	void displayInfo(int m,String b,int s){
		model=m;
		brand=b;
		speed=s;
		System.out.println("Model no is ="+model);
		System.out.println("Brand is ="+brand);
		System.out.println("speed is "+speed);


	}



 

}
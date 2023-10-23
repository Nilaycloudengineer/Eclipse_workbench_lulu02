package com.lulu.exception;

public class ArrayBounds {

 

	public static void main(String[] args) {

		// TODO Auto-generated method stub


		//Perfect

		System.out.println("data here");

		int data[] = new int[5];

		data[0]=10;

		data[1]=20;

		data[2]=30;

		System.out.println("we here");

		data[3]=40;

		data[4]=50;

		data[5]=60;//jvm-Object- java.lang.ArrayIndexOutOfBoundsException:


		System.out.println("Succesful......");


	}

 

}


package com.lulu.exception;

public class ArrayBoundsss {

 

	public static void main(String[] args) {

		// TODO Auto-generated method stub


		//Perfect

		System.out.println("data here");

		int data[] = new int[5];

		data[0]=10;

		data[1]=20;

		data[2]=30;

		System.out.println("we here");

		try {

		data[3]=40;

		data[4]=50;

		//data[5]=60;//jvm-Object- java.lang.ArrayIndexOutOfBoundsException:

		}catch(Exception E) { // gets executed when Object thrown -when exception is there

			System.out.println("All Managed well!");

//			System.out.println(E.printStackTrace());

			E.printStackTrace();

		}finally {//its mandatory for execution whether exception there or not

			System.out.println("release the resources!");


		}

		System.out.println("Succesful......");


	}

 

}

package com.lulu.exception;

public class MyFirstException {

	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//syntax error -grammar based / sytax based error that compiler identifies
		int data ; 

		//exception
		// Abnormal code in class that creates 
		 //abrupt termnation of progran while execution is going on.
		        //exception types
// 		             --checked exceptions(compile exceotion) - 
// 		             --unchecked exception (runtime exception)

		int no1=10;
		int no2=0;

		System.out.println("Process started");
		int no3;
		no3=no1/no2; // not defined infinity -Object by JVM and Thrown 
	                 //it leads to Abrupt termination of the Program
		System.out.println("The result is "+no3) ;

		System.out.println("successful !");

	}
}
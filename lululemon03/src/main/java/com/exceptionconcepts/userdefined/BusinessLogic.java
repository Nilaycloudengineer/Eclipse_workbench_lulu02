package com.exceptionconcepts.userdefined;


public class BusinessLogic {

	void checkEligibility(int age) throws MyException {
		if(age >=18) {
			System.out.println("You can Vote");
		}else {
			///Problematic situation 
			throw new MyException("ppl having age below 18 cant vote");
			//Explicitly throw the Objects
		}

	}



 

}
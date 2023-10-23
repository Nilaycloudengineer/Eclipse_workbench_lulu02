package com.voter.eligibility;
import java.util.*;
public class VoterEligible {
	
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();
	void CheckAge() {
		
		
		
		if (age>=18)
			 System.out.println("Eligible");
			else
			 System.out.println("Not Eligible");
	}
	
	

}

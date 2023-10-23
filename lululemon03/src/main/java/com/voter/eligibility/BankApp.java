package com.voter.eligibility;
import java.util.*;
public class BankApp {
	
	String name ;
	float balance;
	long phone;
	
	void openAccount(String n , float b , long p) {
		name=n;
		balance=b;
		phone=p;
		
	}
	
	void deposit(int amount) {
		Scanner sc = new Scanner(System.in);
		amount = sc.nextInt();
		balance+=amount;
		System.out.println("Your balance is "+balance);
	}
	
	void Info(String n , float b ,long p) {
		System.out.println("Your name is :"+name);
		System.out.println("Your balance is :"+balance);
		System.out.println("Your contact is :"+phone);
	}
    
}
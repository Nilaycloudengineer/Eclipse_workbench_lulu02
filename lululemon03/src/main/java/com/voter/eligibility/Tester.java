package com.voter.eligibility;

public class Tester {
    public static void main(String[] args) {
        BankApp b = new BankApp();
        b.openAccount("Nilay",1000,1234567890);
        System.out.println("Enter amount:");
        b.deposit(7);
        
        b.Info("Nilay" , 1007 ,1234567890);
        System.out.println("Thank You");
    }
}
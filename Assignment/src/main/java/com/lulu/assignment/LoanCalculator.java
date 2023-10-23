package com.lulu.assignment;
import java.util.Scanner;
public class LoanCalculator {

    static float principalAmount = 0;
    static float rate = 0;
    static float time = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        principalAmount = sc.nextFloat();
        System.out.println("Enter the rate :");
        rate = sc.nextFloat();
        System.out.println("Enter the time:");
        time = sc.nextFloat();

        float simpleInterest = (principalAmount * rate * time) / 100;
        float totalAmount = principalAmount + simpleInterest;
        System.out.println("Simple Interest" + simpleInterest);
        System.out.println("Total Amount" + totalAmount);
        sc.close();
    }
}

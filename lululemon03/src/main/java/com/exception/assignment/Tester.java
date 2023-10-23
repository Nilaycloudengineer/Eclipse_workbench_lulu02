package com.exception.assignment;

public class Tester {
    public static void main(String[] args) {
        VoterEligibilityApp app = new VoterEligibilityApp();
        
        try {
            app.checkEligibility(20);  // Testing with a valid age
            app.checkEligibility(15);  // Testing with an invalid age
        } catch (NotEligibleException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

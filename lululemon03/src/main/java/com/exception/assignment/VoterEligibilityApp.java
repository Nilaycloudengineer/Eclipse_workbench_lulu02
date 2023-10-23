package com.exception.assignment;

class VoterEligibilityApp {
    public void checkEligibility(int age) throws NotEligibleException {
        if (age < 18) {
            throw new NotEligibleException("Age is below 18. Not eligible to vote.");
        } else {
            System.out.println("Eligible to vote.");
        }
    }
}

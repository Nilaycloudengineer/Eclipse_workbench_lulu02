package com.lulu.constractor;

public class ElectionTester {
    public static void main(String[] args) {
        // Create an Election object with the default vote age
        Election electionDefault = new Election();

        // Create an Election object with a custom vote age (e.g., 21)
        Election electionCustom = new Election(21);

        // Test eligibility to vote for a person aged 19
        int personAge = 19;
        boolean isEligibleDefault = electionDefault.isEligibleToVote(personAge);
        boolean isEligibleCustom = electionCustom.isEligibleToVote(personAge);

        // Display eligibility results
        System.out.println("Election with default vote age:");
        System.out.println("Is the person aged " + personAge + " eligible to vote? " + isEligibleDefault);

        System.out.println("\nElection with custom vote age (21):");
        System.out.println("Is the person aged " + personAge + " eligible to vote? " + isEligibleCustom);
    }
}
package com.lulu.constractor;

class Election {
    private int voteAge;

    // Constructor with a default vote age of 18
    public Election() {
        this(18); // Calls the parameterized constructor with the default vote age
    }

    // Parameterized constructor
    public Election(int voteAge) {
        this.voteAge = voteAge;
    }

    // Method to check if a person is eligible to vote
    public boolean isEligibleToVote(int age) {
        return age >= voteAge;
    }
}
package com.lulu.string_concept;

public class  understandMeyhod {
	
	public void understandMethod() {
    String name = "My name is RRR"; // String Pool
    String name2 = new String("My name is Khan");  // Heap - JVM - JRE- JDK

    System.out.println(name.charAt(0)); // Prints the character at index 0, which is 'M'.
    System.out.println(name.charAt(12)); // Prints the character at index 12, which is 'R'.
    System.out.println(name.contains("RRR")); // Checks if the string contains "RRR", prints true if it does, false otherwise.
    System.out.println(name.equals(name2)); // Checks if the two strings are equal, prints false since they are not.

    // Additional methods:
    System.out.println(name.length()); // Prints the length of the string.
    System.out.println(name.toUpperCase()); // Converts the string to uppercase.
    System.out.println(name.substring(3, 10)); // Prints a substring from index 3 to 9.
}
	
}


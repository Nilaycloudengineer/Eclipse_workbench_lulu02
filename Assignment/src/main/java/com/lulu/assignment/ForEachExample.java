package com.lulu.assignment;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Cherry");
        strings.add("Date");

        // Using forEach() with a lambda expression
        strings.forEach(str -> System.out.println("String: " + str));

        // Using forEach() with a method reference
        strings.forEach(System.out::println);
    }
}

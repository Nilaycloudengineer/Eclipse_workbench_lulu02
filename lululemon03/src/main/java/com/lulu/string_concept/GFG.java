package com.lulu.string_concept;

public class GFG {

    // Main driver method
    public static void main(String args[])
    {
        // Custom input string
        String str = "Nilay Mishra is King of Mistakes";
        String[] arrOfStr = str.split(" ");

        for (String a : arrOfStr)
            System.out.println(a);
    }
}
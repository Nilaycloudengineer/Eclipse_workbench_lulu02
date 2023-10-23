package com.lulu.basis;

public class VariableTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num1 = 5;
        int num2 = 10;
        int intResult = num1 + num2;
        System.out.println("Integer Result: " + intResult);
        
        // Adding two floating-point numbers
        float float1 = 3.5f;
        float float2 = 2.75f;
        float floatResult = float1 + float2;
        System.out.println("Float Result: " + floatResult);

        // Concatenating two characters as strings
        char char1 = 'A';
        char char2 = 'B';
        String charResult = Character.toString(char1) + Character.toString(char2);
        System.out.println("Character Result: " + charResult);
        
        // Adding two bytes
        byte byte1 = 100;
        byte byte2 = 20;
        byte byteResult = (byte) (byte1 + byte2);
        System.out.println("Byte Result: " + byteResult);
        
        // Concatenating two strings
        String str1 = "Hello, ";
        String str2 = "world!";
        String strResult = str1 + str2;
        System.out.println("String Result: " + strResult);
        
        // Combining two booleans with logical OR
        boolean bool1 = true;
        boolean bool2 = false;
        boolean boolResult = bool1 || bool2;
        System.out.println("Boolean Result: " + boolResult);
        

	}

}

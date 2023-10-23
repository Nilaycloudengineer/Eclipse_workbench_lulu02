package com.lulu.filewriter;

import java.io.FileWriter;
import java.io.IOException;
class CreateFile
{
    public static void main(String[] args) throws IOException
    {
        // Accept a string 
        String str = "LuluLemon Batch 02 "+
                " I am Amit we exploring I O Stram Packages and files";

        // attach a file to FileWriter 
        FileWriter fw=new FileWriter("sahana.txt");//  create a file Open for you

        // read character wise from string and write 
        // into FileWriter 
        for (int i = 0; i < str.length(); i++) {
            fw.write(str.charAt(i));
        }
        System.out.println("Writing successful");
        //close the file 
        fw.close();
    }
}
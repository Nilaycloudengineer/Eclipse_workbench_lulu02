package com.lulu.string_concept;
import java.util.stringTokenizer;
public class StringTokenizer {
	public static void main(String args[]) {
		StringTokenizer st = new StringTokenizer("my name is RRR","");
		//st = "hello" ; non valid 
		//st.append("ghgfhf") ; Not valid 
		
		int counter=0;
		//true  //false
		
		 while (st.hasMoreTokens()) {
			 System.out.println(++counter);
			 System.out.println(st.nextTokens());
		 }
	}

}

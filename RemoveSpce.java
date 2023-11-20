package com.org.main;
import java.util.Scanner;
public class RemoveSpce {

	
		public static void main(String[] args) {
		  Scanner sc =new Scanner(System.in);
		  String s = "Prepinsta is best";
		  char[] c = s.toCharArray();
		  StringBuffer sb = new StringBuffer();
		  
		  
		  for (int i = 0; i < c.length; i++) {
			  System.out.println("c[i] is : "+c[i]);
		     if( (c[i] != ' ') && (c[i]!= '\t' )) {
/*(c[i] != ' ') checks if the character at index i in the array c is not a space (' ').
(c[i] != '\t') checks if the character at index i in the array c is not a tab ('\t').*/
		    	 sb.append(c[i]);
/*If both of these conditions are met (i.e., if c[i] is neither a space nor a tab), 
* the character at index i is appended to the StringBuilder sb using the append method.*/
		     }    	
	          }
		  System.out.println("String after removing spaces : "+sb);
	    }
	}
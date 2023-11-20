package com.org.main;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String str=scan.next();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
			rev=rev+str.charAt(i);
		System.out.println("step-1 : "+str);
			if(str.equals(rev))
				System.out.println("string is palindrome");
			else 
				System.out.println("not palindrome");
		
	}

}

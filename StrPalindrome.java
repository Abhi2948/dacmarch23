package com.org.main;

import java.util.Scanner;

public class StrPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a string");
		String input=scan.nextLine();
		System.out.printf("is %s a palindrome? : %b %n",input,isPalindrome(input));
		System.out.println("please enter another string ");
		input= scan.nextLine();
		System.out.printf("is %s a palindrome? : %b %n",input,isPalindrome(input));
		scan.close();
		
	}
	public static boolean isPalindrome(String input) {
		if(input==null||input.isEmpty()) {
			return true;
		}
		char [] array=input.toCharArray();
		
		StringBuilder sb=new StringBuilder(input.length());
		for(int i=input.length()-1;i>=0;i--)
		{
			System.out.println("i is : "+i+"  input.length is : "+input.length());
			sb.append(array[i]);
			/*sb: This is a StringBuilder object. 
			 * StringBuilder is used for efficiently building and modifying strings.
append: This is a method of the StringBuilder class. 
It's used to add various types of data to the StringBuilder.
array: This is a character array created from the input string using input.toCharArray(). 
It allows you to access individual characters in the input string.
i: This is an integer variable that's used as an index to access characters in the array.*/
		}
		String reverseOfString=sb.toString();
		return input.equals(reverseOfString);
	}

}

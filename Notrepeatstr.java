package com.org.main;
import java.util.Scanner;

public class Notrepeatstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the string");
		String str = scan.next();
		int freq[]=new int[256];
		/*new int[256]: This part of the declaration initializes the array. 
		 * It creates a new integer array with a size of 256 elements. 
		 * The array will have elements at indices from 0 to 255.*/
		System.out.println(str.length());
		for(int i=0;i<str.length();i++)
			
		/*System.out.println(str.charAt(i));
		 * enter the string
abhishek
8
a
b
h
i
s
h
e
k*/
			freq[str.charAt(i)]++;
		
		System.out.println("the non repeating char are : ");
		for(int i=0;i<256;i++)
			if(freq[i]==1)
				System.out.println((char)i+" ");

	}

}

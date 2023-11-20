package com.org.main;
import java.util.Scanner;
public class FrequencyStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = scan.nextLine();
		int[] freq = new int[str.length()];
		System.out.println("length of string->"+str.length());
		int i , j;
		char string[] = str.toCharArray();
		// is used in Java to convert a String into an array of characters
		
		for(i=0;i<str.length();i++) {
			System.out.println("step-1 i is "+i);
			freq[i]=1;//means pehle se ek char already hai
			for(j=i+1;j<str.length();j++) {
				System.out.println("step-2       j = "+j);
				
				if(string[i]==string[j]) {
					freq[i]++;
					System.out.println("step-3         freq = "+freq[i]);
					string[j]='0';
					System.out.println("step-4            now j = "+string[j]);
				}	
			}
		}
	
	System.out.println("characters and their corresponding frequencies");
	for(i=0;i<freq.length;i++) {
		if(string[i]!=' ' && string[i]!='0') 
			System.out.println(string[i]+" "+freq[i]);
	}
	}
}

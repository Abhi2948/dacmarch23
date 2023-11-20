package com.org.main;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
static boolean isAnagram(String str1,String str2)//method declare and parameter
{
	String s1=str1.replaceAll("[\\s]","");
	String s2=str2.replaceAll("[\\s]","");
	boolean status = true;
	if(s1.length()!= s2.length())
		status=false;
	else {
		char[] a1=s1.toLowerCase().toCharArray();
		char[] a2=s2.toLowerCase().toCharArray();
		Arrays.sort(a1);
		System.out.println("step-1 a1 is "+a1);
		
		Arrays.sort(a2);
		System.out.println("step-2 a2 is "+a2);
		
		status = Arrays.equals(a1, a2);
		System.out.println("step-3 is "+status);
	}
	return status;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two string : ");
		String s1 = scan.next();
		String s2 = scan.next();
		boolean status = isAnagram(s1,s2);//method call and arguments passed
		if(status)
			System.out.println(s1+" and "+s2+" are anagram ");
		else
			System.out.println(s1+" and "+s2+" are not anagram ");
		
	}

}

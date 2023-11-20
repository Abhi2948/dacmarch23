package com.org.main;

import java.util.Scanner;

public class Replacesubstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string : ");
		String s1=scan.nextLine();
		System.out.println("enter the string to replace : ");
		String oldString=scan.nextLine();
		System.out.println("enter the new string");
		String newString=scan.nextLine();
		String replaceString=s1.replace(oldString,newString);
		System.out.println("New String is : "+replaceString);

	}

}

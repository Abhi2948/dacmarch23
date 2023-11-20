package com.org.main;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the character : ");
		char c=scan.next().charAt(0);
		int i=c;
		System.out.println("ascii value of "+c+" is "+i);
		scan.close();
	}

}

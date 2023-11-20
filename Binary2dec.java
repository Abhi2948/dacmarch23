package com.org.main;

import java.util.Scanner;

public class Binary2dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a binary number : ");
		int binary =scan.nextInt();
		int decimal=0;
		int n=0;
		while(binary>0) {
			int temp=binary%10;
			System.out.println("temp is binary%10 : "+temp);
			decimal+=temp*Math.pow(2, n);
			System.out.println("decimal is : "+decimal);
			binary=binary/10;
			System.out.println("binary is : "+binary);
			n++;
		}
		System.out.println("decimal number : "+decimal);
		scan.close();

	}

}

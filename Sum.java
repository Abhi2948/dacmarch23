package com.org.main;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		int sum = getSum(num);
		System.out.println("sum of numbers "+sum);
	}
	static int getSum(int n) {
		if(n==0)
			return n;
		return n+getSum(n-1);
		
	}

}

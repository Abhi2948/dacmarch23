package com.org.main;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number : ");
		int num=scan.nextInt();
		int len;
		len=order(num);
		System.out.println("the length is : "+len);
		if(armstrong(num,len))
			System.out.println(num+" is armstrong");
		else
			System.out.println(num+" is not armstrong");

	}
	static int order(int x) {
		int len=0;
		while(x!=0)
		{
			len++;
			x=x/10;
			System.out.println("calculate length : "+ x);
		}
		return len;
	}
	static boolean armstrong(int num,int len) {
		int sum=0,temp,digit;
		System.out.println("num is : "+num);
		temp=num;
		while(temp!=0) {
			digit=temp%10;
			System.out.println("digit is : "+digit);
			sum=sum+(int)Math.pow(digit, len);
			System.out.println("sum is : "+sum);
			temp/=10;
			System.out.println("temp is : "+temp);
		};
		return num==sum;
	}

}

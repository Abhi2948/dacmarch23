package com.org.main;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=scan.nextInt();
		System.out.println("Reverse of "+ num + " is");
		int rev=0;
		String str="*";
		while(num!=0)
		{
			int picklast=num%10;
			System.out.println(" step-1 "+picklast);
			
			str=str+Integer.toString(picklast);
			System.out.println(" step-2 "+str);
			
			num=num/10;
			System.out.println(" step-3 "+num);
			
			//System.out.print(str);
			scan.close();
		}

	}

}

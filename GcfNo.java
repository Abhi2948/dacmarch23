package com.org.main;

import java.util.Scanner;

public class GcfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the 1st number : ");
		int num1 = scan.nextInt();
		System.out.print("enter the 2nd : ");
		int num2 = scan.nextInt();
		int n=1;
		System.out.println("HCF of "+ num1+" and "+num2+" is ");
		if(num1!=num2) {
			while(n!=0) {
				n=num1%num2;
				System.out.println("step-1 n : "+n);
				
				if(n!=0) {
					num1=num2;
					System.out.println("step-2 num1 : "+num1);
					num2=n;
					System.out.println("step-3 num2 : "+num2);
				}
			}
			System.out.println("common factor : "+num2);
		}else
			System.out.println("wrong input");
		scan.close();

	}

}

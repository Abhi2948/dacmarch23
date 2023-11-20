package com.org.main;
import java.util.Scanner;
public class Automorphic {
//number whose square has same digits in the end as the number itself
	//216- not
	//76->5776 automorphic
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		String s1=Integer.toString(num);
		System.out.println("s1 is : "+s1);
		
		int l1=s1.length();
		System.out.println(l1);
		int sq=num*num;
		String s2=Integer.toString(sq);
		System.out.println("s2 is : "+s2);
		
		int l2=s2.length();
		System.out.println(l2);
		
		String s3=s2.substring(l2-l1);
		System.out.println("s3 is : "+s3);
		
		if(s1.equals(s3))
			System.out.println("automorphic number");
		else
			System.out.println("not an automorphic");
		scan.close();

	}

}

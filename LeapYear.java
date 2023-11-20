package com.org.main;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a year");
		int year = scan.nextInt();
		if(isLeapYear(year)) {
			System.out.println(year+" is a leap year");
		}
		else
		{
			System.out.println(year+" not a leap year");
		}

	}
	public static boolean isLeapYear(int year) {
		if((year%4==0 && year%100!=0)||year%400==0) {
			return true;
		}else {
			return false;
		}
	}

}

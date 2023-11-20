package com.org.main;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num=scan.nextInt();
		if(num>=0) {
			System.out.println(num+" factorial : "+getFact(num));
		}
		else
			System.out.println("negative number : no factorial");
		

	}
	private static int getFact(int num) {
		if(num==1||num==0)
			return 1;
		return num*getFact(num-1);
	}

}

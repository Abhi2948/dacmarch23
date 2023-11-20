package com.org.main;
import java.util.Scanner;
public class Removechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string : ");
		String str=scan.nextLine();
		str=str.replaceAll("[^a-zA-Z]", " ");
		System.out.println(str);

	}

}

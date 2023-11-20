package com.org.main;

import java.util.Scanner;

public class VowelConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the character");
		char c=scan.next().charAt(0);
		if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			System.out.println("vowel");
		else if((c>='A' && c<='Z')||(c>='a'&&c<='z'))
			System.out.println("consonant");
		else
			System.out.println("not a alphabet");
		scan.close();

	}

}

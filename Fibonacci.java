package com.org.main;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int a=0,b=1;
		System.out.println(a+"<-a "+b+"<-b ");
		int nextTerm;
		for(int i=2;i<num;i++) {
			nextTerm=a+b;
			System.out.println("step-1 (a+b) "+nextTerm);
			
			a=b; 
			System.out.println("step-2 a : "+a);
			
			b=nextTerm;
			System.out.println("step-3 b : "+b);
			
			System.out.println(nextTerm+" ");
		}

	}

}

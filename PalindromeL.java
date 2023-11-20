package com.org.main;

public class PalindromeL {
	static boolean isPalindrome(int n) {
		int divisor=1;
		System.out.println("n is : "+n);
		while(n/divisor>=10)
			divisor*=10;
		System.out.println("the divisor is : "+divisor);
		while(n!=0) {
			int x=n/divisor;
			System.out.println("x is : "+x);
			int y=n%10;
			System.out.println("y is : "+ y);
			if(x!=y)
				return false;
			n=(n%divisor)/10;
			System.out.println("n is : "+n);
			divisor=divisor/100;
			System.out.println("the new divisor is : "+divisor);
		}
		return true;
	}
	static int largestPalindrome(int[] a,int n) {
		int res=-1;
		for(int i=0;i<n;i++) {
			System.out.println("i is : "+i);
			if(a[i]>res && isPalindrome(a[i]))
				res=a[i];
			System.out.println("the result is : "+res);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {121,2322,54545,999990};
		int n =a.length;
		System.out.println(largestPalindrome(a,n));

	}

}

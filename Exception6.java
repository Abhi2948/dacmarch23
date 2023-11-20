package com.org.main;
/*Create a program that demonstrates how to handle multiple exceptions in a single try-catch block.
*/
public class Exception6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result=5/0;
			String str=null;
			System.out.println(str.length());
		}catch(ArithmeticException | NullPointerException e) {
			System.out.println("error : "+e.getMessage());
		}

	}

}

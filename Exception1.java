package com.org.main;
/*Write a Java program to handle the ArithmeticException that occurs when dividing by zero.

*/
public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result=5/0;
			System.out.println("result is : "+result);
		}catch(ArithmeticException e) {
			System.out.println("error division by zero is not allowed. ");
		}
	}

}

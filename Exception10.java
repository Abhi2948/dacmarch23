package com.org.main;
/*Create a program to handle the StackOverflowError that occurs due to excessive recursive method calls.
*/
public class Exception10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			recursiveMethod();
		}catch(StackOverflowError e) {
			System.out.println("error : stackoverflowerror occured.");
		}

	}
	public static void recursiveMethod() {
		recursiveMethod();
	}

}

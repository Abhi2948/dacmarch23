package com.org.main;
/*Create a program that handles the NullPointerException when trying to access a method or property of a null object.
*/
public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//String str="abcde";
			
			String str=null;
			System.out.println(str.length());
			
		}catch(NullPointerException e) {
			System.out.println("error null reference encountered. ");
		}

	}

}

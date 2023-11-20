package com.org.main;
/*Write a Java program to handle the StringIndexOutOfBoundsException 
 * when trying to access characters in a string beyond its length.
*/
public class Exception9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String str="hello";
			//char ch=str.charAt(4);
			char ch=str.charAt(10);
			System.out.println("character : "+ch);
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("error : String index out of bounds, ");
		}

	}

}

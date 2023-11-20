package com.org.main;
/*Create a program that handles the NumberFormatException when trying to parse a non-integer string into an integer.
*/
public class Exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//String str="123";
			String str="abc";
			int num=Integer.parseInt(str);
			System.out.println("parsed number : "+num);
		}catch(NumberFormatException e) {
			System.out.println("error invalid number format. ");
		}
	}

}

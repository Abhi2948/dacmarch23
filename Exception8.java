package com.org.main;
/*Create a program to handle the ClassCastException 
 * when trying to cast an object to an incompatible type.
*/
public class Exception8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Object obj="hello";
			Integer num=(Integer) obj;//error
			System.out.println("value : "+num);
		}catch(ClassCastException e) {
			System.out.println("error : classcastexception occured.");
		}

	}

}

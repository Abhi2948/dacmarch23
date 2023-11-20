package com.org.main;
/*Write a Java program to demonstrate the ArrayIndexOutOfBoundsException when accessing an array element with an invalid index.
*/
public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] arr= {1,2,3};
			System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("error array index out of bounds. ");
		}

	}

}

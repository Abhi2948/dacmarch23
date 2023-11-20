package com.org.main;
/*Write a Java program to find the size of an ArrayList.
*/
import java.util.ArrayList;
import java.util.List;
public class ArrayList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		int size = num.size();
		System.out.println("size of the array is : "+size);
	}

}

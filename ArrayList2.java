package com.org.main;
/*Write a Java program to access an element in an ArrayList by its index*/
import java.util.ArrayList;
import java.util.List;
public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=new ArrayList<>();
		num.add(5);
		num.add(6);
		num.add(7);
		int ele=num.get(1);
		System.out.println("elements at the index : "+ele);

	}

}

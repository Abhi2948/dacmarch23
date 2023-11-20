package com.org.main;

import java.util.ArrayList;
import java.util.List;

/*Write a Java program to iterate through an ArrayList and print its elements.
*/
public class ArrayList9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> animals=new ArrayList<>();
		animals.add("Lion");
		animals.add("tiger");
		animals.add("bear");
		for(String animal : animals) {
			System.out.println(animal);
		}
	}

}

package com.org.main;
/*Write a Java program to remove an element from an ArrayList.
*/
import java.util.ArrayList;
import java.util.List;
public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("green");
		colors.add("yellow");
		colors.remove("red");
		System.out.println("arraylist after removing an ele : "+colors);
	}

}

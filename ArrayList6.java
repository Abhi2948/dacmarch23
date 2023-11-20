package com.org.main;
/*Write a Java program to clear all elements from an ArrayList.

*/
import java.util.ArrayList;
import java.util.List;
public class ArrayList6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=new ArrayList<>();
		names.add("ankur");
		names.add("abhishek");
		names.add("anshul");
		names.add("sankalp");
		names.clear();
		System.out.println("arraylist after clearing : "+names);

	}

}

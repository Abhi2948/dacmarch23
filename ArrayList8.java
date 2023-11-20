package com.org.main;
/*Write a Java program to copy elements from one ArrayList to another.

*/
import java.util.ArrayList;
import java.util.List;
public class ArrayList8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> sourceList = new ArrayList<>();
		sourceList.add(1);
		sourceList.add(22);
		sourceList.add(32);
		List<Integer> destination=new ArrayList<>(sourceList);
		System.out.println("destination arrayList : "+destination);
		

	}

}

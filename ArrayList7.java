package com.org.main;
/*Write a Java program to check if an element exists in an ArrayList.
*/
import java.util.ArrayList;
import java.util.List;
public class ArrayList7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits=new ArrayList<>();
		fruits.add("orange");
		fruits.add("banana");
		fruits.add("mango");
		String searchElement="Banana";
		boolean exists=fruits.contains(searchElement);
		System.out.println(searchElement+" exists in the arrayList : "+exists);

	}

}

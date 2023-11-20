package com.org.main;
/*Write a Java program to update an element in an ArrayList.
*/
import java.util.ArrayList;
import java.util.List;
public class ArrayList10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cities=new ArrayList<>();
		cities.add("new york");
		cities.add("Los Angeles");
		cities.add("Chicago");
		cities.set(1, "san franc");
		System.out.println("arraylist after updating an ele : "+cities);
	}

}

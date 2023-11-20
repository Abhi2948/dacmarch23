package org.main.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> fruitcollection = new ArrayList<>();
		fruitcollection.add("banana");
		fruitcollection.add("apple");
		fruitcollection.add("mango");
		fruitcollection.add("grapes");
		System.out.println(fruitcollection);
		fruitcollection.remove("banana");
		System.out.println(fruitcollection);
		
		System.out.println(fruitcollection.contains("grapes"));
		fruitcollection.forEach((element)->{
			System.out.println(element);
		});
		fruitcollection.clear();
		System.out.println(fruitcollection);
	}

}

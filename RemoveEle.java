package org.main.collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits=new ArrayList<>();
		fruits.add("apple0");
		fruits.add("apple1");
		fruits.add("apple2");
		fruits.add("apple3");
		fruits.add("apple4");
		fruits.add("apple5");
		
		System.out.println(fruits);
		fruits.remove(3);
		System.out.println(" after removing"+fruits);
		fruits.remove("apple4");
		System.out.println(" after removing 4th apple "+fruits);
		
		List <String> subfruits=new ArrayList<>();
		subfruits.add("apple1");
		subfruits.add("apple2");
		fruits.removeAll(subfruits);
		System.out.println(fruits);
		fruits.clear();
		System.out.println(fruits);

	}

}

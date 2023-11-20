package org.main.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("ele1");
		list.add("ele1");
		list.add("ele2");
		list.add("ele3");
		System.out.println(list);
		list.add(null);
		System.out.println(list);
		list.add("element1");
		list.add("element4");
		list.add("element3");
		list.add("element2");
		list.add("element5");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(4));
		System.out.println(list.get(6));
	}

}

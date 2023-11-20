package org.main.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class IterateOverList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> courses=Arrays.asList("c","c++","python","java","spring");
		for(int i=0;i<courses.size();i++) {
			System.out.println(courses.get(i));
		}
		for(String course:courses) {
			System.out.println(course);
		}
		for(Iterator iterator=courses.iterator();iterator.hasNext();) {
			String course=(String) iterator.next();
			System.out.println(course);
			
		}
		Iterator<String> iterator=courses.iterator();
		while(iterator.hasNext()) {
			String course=(String) iterator.next();
		}
		courses.stream().forEach(course->System.out.println(course));
		courses.forEach(course->System.out.println(course));

	}

}

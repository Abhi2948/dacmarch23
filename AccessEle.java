package org.main.collections;

import java.util.ArrayList;
import java.util.List;

public class AccessEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> topProgram=new ArrayList<>();
		System.out.println("is the topProgramminglanguage is empty ? : "+topProgram.isEmpty());
		topProgram.add("c#");
		topProgram.add("c");
		topProgram.add("c++");
		topProgram.add("java");
		System.out.println("here are the top "+ topProgram.size()+" program lang in the world");
		String bestPROG = topProgram.get(1);
		System.out.println("bestPROG =>"+ bestPROG);
		topProgram.set(3," python");
		System.out.println(topProgram);
	}

}

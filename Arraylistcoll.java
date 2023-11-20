package org.main.collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylistcoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> prime=new ArrayList<>();
		prime.add(2);
		prime.add(3);
		prime.add(5);
		prime.add(7);
		prime.add(11);
		List<Integer> nxtprime=new ArrayList<>(prime);
		
		List<Integer> nxtprimeno=new ArrayList<>();
		nxtprimeno.add(13);
		nxtprimeno.add(17);
		nxtprimeno.add(19);
		nxtprimeno.add(23);
		nxtprimeno.add(29);
		
		nxtprime.addAll(nxtprimeno);
		
		System.out.println(nxtprime);
		

	}

}

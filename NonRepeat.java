package com.org.main;

import java.util.Arrays;

public class NonRepeat {
	public static void countfreq(int arr[],int n) {
		boolean visited[]=new boolean[n];
		/*visited is a boolean array of size n, 
		 * which is used to keep track of 
		 * whether each element in the arr array has been visited or not*/
		Arrays.fill(visited, false);
		/*Arrays is a class in Java's java.util package that provides utility methods for working with arrays.
fill is a static method of the Arrays class that can be used to fill an array with a specified value.
Arrays.fill(visited, false); fills the entire visited array with the boolean value false,
 effectively marking all elements as unvisited. 
This is often done at the beginning of an algorithm that involves processing elements of an array one by one*/
		for(int i=0;i<n;i++) {
			System.out.println("i is : "+arr[i]);
			if(visited[i]==true)
				continue;
			int count=1;
			for(int j=i+1;j<n;j++) {
				System.out.println("j is  :  "+j+"="+arr[j]);
				if(arr[i]==arr[j]) {
					visited[j]=true;
					//count++;
					System.out.println(count++);
				}
			}
			if(count==1)
				System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {10,30,40,20,10,20,50,10};
		int n=arr.length;
		countfreq(arr,n);

	}

}

package com.org.main;

import java.util.Arrays;

public class ReplacearrRank {
	static void changeArr(int [] input)
	{
		int newArray[]=Arrays.copyOfRange(input,0,input.length);
		/* This line creates a new integer array newArray that is a copy of the input array. 
		 * This step is important because you want to sort newArray 
		 * without altering the original input array.
		 * input: This is the source array from which you want to copy elements. 
		 * In this case, it's an integer array called input*/
		Arrays.sort(newArray);
		System.out.println(input.length);
		for(int i=0;i<input.length;i++) {
			System.out.println("i is "+i);
			for(int j=0;j<input.length;j++) {
				System.out.println("j is "+j);
				if(newArray[j]==input[i]) {
					input[i]=j+1;
					System.out.println("Rank is "+input[i]);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {100,2,70,12,90};
		System.out.println(Arrays.toString(arr));
		changeArr(arr);
		System.out.println(Arrays.toString(arr));

	}

}

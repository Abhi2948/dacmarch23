package com.org.main;

public class Bubblesort {
	public static void bubblesort(int[] arr) {
		int n=arr.length;
		boolean swapped;
		for(int i=0;i<n-1;i++) {
			System.out.println("i is "+i);
			swapped=false;
			for(int j =0;j<n-1;j++) {
				System.out.println(j);
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					System.out.println("step-1 is "+temp);
					arr[j]=arr[j+1];
					System.out.println("step-2 is "+arr[j]);
					arr[j+1]=temp;
					System.out.println("step-3 is "+arr[j+1]);
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {6,3,2,1,9};
		System.out.println("original arr : ");
		printArray(arr);
		bubblesort(arr);
		System.out.println("\n sorted array : ");
		printArray(arr);

	}
public static void printArray(int[] arr) {
	for(int value : arr) {
		System.out.println(value+" ");
	}
	System.out.println();
}
}

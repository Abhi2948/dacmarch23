package com.org.main;

public class EleAsce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int[] {10,40,30,20,50};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println("i is : "+i);
			for(int j=i+1;j<arr.length;j++) {
				System.out.println("j is : "+j);
				if(arr[i]>arr[j]) {
					temp=arr[i];
					System.out.println("temp is "+temp);
					arr[i]=arr[j];
					System.out.println("arr[i] is "+arr[i]);
					arr[j]=temp;
					System.out.println("arr[j] is "+arr[j]);
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("i is = "+i);
			System.out.println(arr[i]+" ");
		}

	}

}

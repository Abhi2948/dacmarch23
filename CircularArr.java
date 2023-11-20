package com.org.main;

public class CircularArr {
static void leftRotater(int arr[],int d,int n) {
	for(int i=0;i<d;i++)
		leftRotatebyOne(arr,n);
}
static void leftRotatebyOne(int arr[],int n) {
	int i,temp;
	temp=arr[0];
	for(i=0;i<n-1;i++)
		arr[i]=arr[i+1];
	System.out.println("step-1 is : "+arr[i]);
	arr[n-1]=temp;
	System.out.println("step-2 is : "+arr[n-1]);
	
}
static void printArray(int arr[],int n) {
	for(int i=0;i<n;i++)
		System.out.println(arr[i]+"*");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		leftRotater(arr,2,5);
		/*2 - This is an integer and it's the number of positions you want to rotate the array to the left. 
		 * In this case, you want to perform a left rotation of the array by 2 positions.
		5 - This is also an integer and it represents the length of the array, which is 5 in this case.*/
		printArray(arr,5);

	}

}

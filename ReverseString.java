package com.org.main;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalString="i love my family";
		String reverseString=reverseString(originalString);
		System.out.println("original string : "+ originalString);
		System.out.println("reverse string : "+ reverseString);
	}
	private static String reverseString(String str) {
		char[] charArray=str.toCharArray();
		int left=0;
		int right=charArray.length-1;
		while(left<right) {
			char temp=charArray[left];
			charArray[left]=charArray[right];
			charArray[right]=temp;
			left++;
			right--;
		}
		return new String(charArray);
	}

}

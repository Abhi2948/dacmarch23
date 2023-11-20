package com.org.main;

public class MinNo {

    public static void main(String[] args) {
        int arr[] = {12, 13, 5, 10, 34, 10};
        int min = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
        	System.out.println("i is : "+arr[i]);// Corrected the loop condition
            if (arr[i] < min) {
                min = arr[i];
                System.out.println("min is : "+min);
            }
        }

        System.out.print("finally minimum is : "+min);
    }
}

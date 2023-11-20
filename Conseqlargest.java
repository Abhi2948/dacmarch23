package com.org.main;
import java.io.*;
import java.util.*;
public class Conseqlargest {
    static int findLongestConseqSubseq(int arr[], int n)
    {
         // Sort the array
        Arrays.sort(arr);
         int ans = 0, count = 0; 
        ArrayList v = new ArrayList();
        v.add(10);       
        // Insert repeated elements
        // only once in the vector
        for (int i = 1; i < n; i++)
        {
            if (arr[i] != arr[i - 1])
                v.add(arr[i]);
        } 
        // Find the maximum length
        // by traversing the array
        for (int i = 0; i < v.size(); i++)
        { 
            // Check if the current element is
            // equal to previous element +1
            if (i > 0 && v.get(i) == v.get(i - 1))
                count++;
            else
                count = 1;
             // Update the maximum
            ans = Math.max(ans, count);
        }
        return ans;
    }
     // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 11, 91, 32, 100, 14, 204, 21 };
        int n = arr.length;
        System.out.println(
            "Length of the Longest "
            + "contiguous subsequence is "
            + findLongestConseqSubseq(arr, n));
    }
}
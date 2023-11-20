package com.org.main;

public class ReverseString2 {

    public static void main(String[] args) {
        String originalString = "I love my family";
        String reversedString = reverseString(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }

    private static String reverseString(String str) {
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]).append(" ");
        }

        return reversedString.toString().trim();
    }
}

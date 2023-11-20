package org.main.practice;

public class Equals {

    public static void main(String[] args) {
        // Question 1: Compare strings using equals
        String str1 = "Hello";
        String str2 = "Hello";
        boolean areEqual1 = str1.equals(str2);
        System.out.println("Are equal (using equals): " + areEqual1);

        // Question 2: Compare strings using ==
        String str3 = "Hello";
        String str4 = "Hello";
        boolean areEqual2 = (str3 == str4);
        System.out.println("Are equal (using ==): " + areEqual2);

        // Question 3: Compare string literals using ==
        String str5 = "Hello";
        String str6 = "Hello";
        boolean areEqual3 = (str5 == str6);
        System.out.println("Are equal (using == with string literals): " + areEqual3);

        // Question 4: Compare string objects using equals
        String str7 = new String("Hello");
        String str8 = new String("Hello");
        boolean areEqual4 = str7.equals(str8);
        System.out.println("Are equal (using equals with string objects): " + areEqual4);

        // Question 5: Compare string objects using ==
        String str9 = new String("Hello");
        String str10 = new String("Hello");
        boolean areEqual5 = (str9 == str10);
        System.out.println("Are equal (using == with string objects): " + areEqual5);

        // Question 6: Explain the difference between equals and ==
        String str11 = "Hello";
        String str12 = new String("Hello");
        boolean areEqual6 = str11.equals(str12);
        boolean areEqual7 = (str11 == str12);
        System.out.println("Difference between equals and ==:");
        System.out.println("Using equals: " + areEqual6);
        System.out.println("Using ==: " + areEqual7);

        // Question 7: Case-insensitive comparison using equalsIgnoreCase
        String str13 = "Hello";
        String str14 = "hello";
        boolean areEqualIgnoreCase = str13.equalsIgnoreCase(str14);
        System.out.println("Are equal (ignoring case): " + areEqualIgnoreCase);

        // Question 8: Compare different strings using equals
        String str15 = "Hello";
        String str16 = "Hello";
        boolean areEqual8 = str15.equals(str16);
        System.out.println("Are equal (using equals): " + areEqual8);

        // Question 9: Compare different strings using ==
        String str17 = "Hello";
        String str18 = "Hello";
        boolean areEqual9 = (str17 == str18);
        System.out.println("Are equal (using ==): " + areEqual9);

        // Question 10: Use cases for equals and ==
        String str19 = "Hello";
        String str20 = "Hello";
        String str21 = new String("Hello");
        boolean areEqualCase1 = str19.equals(str20);
        boolean areEqualCase2 = (str19 == str20);
        boolean areEqualCase3 = str19.equals(str21);
        boolean areEqualCase4 = (str19 == str21);

        System.out.println("Use cases for equals and ==:");
        System.out.println("str19.equals(str20): " + areEqualCase1);
        System.out.println("str19 == str20: " + areEqualCase2);
        System.out.println("str19.equals(str21): " + areEqualCase3);
        System.out.println("str19 == str21: " + areEqualCase4);
    }
}

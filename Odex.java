package org.main.practice;

public class Odex {

    public static void main(String[] args) {
        // charAt()
        String str = "Hello, World!";
        char charAt5 = str.charAt(11);

        System.out.println("charAt(5): " + charAt5);

        // compareTo()
        String str1 = "apple";
        String str2 = "banana";
        int compareToResult = str1.compareTo(str2);
        System.out.println("compareTo(): " + compareToResult);

        // concat()
        String concatResult = str1.concat("*" + str2);
        System.out.println("concat(): " + concatResult);

        // contains()
        boolean containsResult = str1.contains("bana");
        System.out.println("contains(\"ple\"): " + containsResult);

        // endsWith()
        boolean endsWithResult = str1.endsWith("ple");
        System.out.println("endsWith(\"ple\"): " + endsWithResult);

        // equals() and equalsIgnoreCase()
        boolean equalsResult = str1.equals("banana");
        boolean equalsIgnoreCaseResult = str1.equalsIgnoreCase("BANANA");
        System.out.println("equals(\"apple\"): " + equalsResult);
        System.out.println("equalsIgnoreCase(\"APPLE\"): " + equalsIgnoreCaseResult);

        // format()
        String formattedString = String.format("There are %d apples and %d bananas.", 3, 5);
        System.out.println("format(): " + formattedString);

        // indexOf()
        int indexOfA = str1.indexOf("a");
        int indexOfX = str1.indexOf("n");
        System.out.println("indexOf(\"a\"): " + indexOfA);
        System.out.println("indexOf(\"x\"): " + indexOfX);

        // isEmpty()
        boolean isEmptyResult = str1.isEmpty();
        System.out.println("isEmpty(): " + isEmptyResult);

        // join()
        String[] fruits = {"apple", "banana", "cherry"};
        String joined = String.join(", ", fruits);
        System.out.println("join(): " + joined);

        // lastIndexOf()
        int lastIndexOfA = str1.lastIndexOf("a");
        int lastIndexOfX = str1.lastIndexOf("b");
        System.out.println("lastIndexOf(\"a\"): " + lastIndexOfA);
        System.out.println("lastIndexOf(\"x\"): " + lastIndexOfX);

        // length()
        int length = str.length();
        System.out.println("length(): " + length);

        // replace()
        String replacedString = str1.replace("a", "o");
        System.out.println("replace(\"a\", \"o\"): " + replacedString);

        // replaceAll()
        String replacedAllString = str1.replaceAll("a", "o");
        System.out.println("replaceAll(\"a\", \"o\"): " + replacedAllString);

        // split()
        String sentence = "This is a sample sentence.";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println("split(): " + word);
        }

        // startsWith()
        boolean startsWithResult = str1.startsWith("ba");
        System.out.println("startsWith(\"app\"): " + startsWithResult);

        // substring()
        String subStringResult = str1.substring(1, 4);
        System.out.println("substring(1, 4): " + subStringResult);

        // toCharArray()
        char[] charArray = str.toCharArray();
        System.out.println("toCharArray(): " + new String(charArray));

        // toLowerCase()
        String lowerCaseString = str1.toLowerCase();
        System.out.println("toLowerCase(): " + lowerCaseString);

        // toUpperCase()
        String upperCaseString = str1.toUpperCase();
        System.out.println("toUpperCase(): " + upperCaseString);

        // trim()
        String stringWithWhitespace = "           This has leading and trailing whitespace.   ";
        String trimmedString = stringWithWhitespace.trim();
        System.out.println("trim(): " + trimmedString);

        // valueOf()
        int number = 42;
        String numberAsString = String.valueOf(number);
        System.out.println("valueOf(): " + numberAsString);
    }
}

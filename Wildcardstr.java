package com.org.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wildcardstr {
	public static boolean isMatchWithwildcards(String pattern,String text) {
		pattern=Pattern.quote(pattern);
		pattern=pattern.replace("*",".*" );
		Pattern regexPattern=Pattern.compile(pattern);
		Matcher matcher=regexPattern.matcher(text);
		return matcher.matches();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern="abc*de";
		String text1="abcdef";
		String text2="abcxde";
		boolean isMatch1=isMatchWithwildcards(pattern,text1);
		boolean isMatch2=isMatchWithwildcards(pattern,text1);
		System.out.println("text1 matches the pattern : "+isMatch1);
		System.out.println("text2 matches the pattern : "+isMatch2);

	}

}

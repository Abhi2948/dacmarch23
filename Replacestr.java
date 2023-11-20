package com.org.main;
import java.util.Scanner;
public class Replacestr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string : ");
		String s1= scan.nextLine();
		/*enter a string : 
		i am abhishek*/
		System.out.println("enter the string to replace : ");
		String oldString= scan.nextLine();
		/*enter the string to replace : 
abhishek
*/
		System.out.print("enter the new string : ");
		String newString = scan.nextLine();
		/*enter the new string : ankur
new string is : i am ankur*/
		String replaceString=s1.replace(oldString,newString);
		System.out.println("new string is : "+replaceString);

	}

}

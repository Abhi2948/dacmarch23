package com.org.main;
/*Write a Java program to handle the FileNotFoundException 
 * when trying to read from a non-existent file.
*/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Exception7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br=new BufferedReader(new FileReader("non_existent_file.txt"));
		}
		catch(FileNotFoundException e) {
			System.out.println("error file not found.");
		}catch(IOException e) {
			System.out.println("error : IOException occured.");
		}
	}

}

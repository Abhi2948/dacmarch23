package org.main.practice;

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		//String str=(String)num;
		String str=Integer.toString(num);
		String str2=String.valueOf(num);
		System.out.println(str+" "+str2);
		System.out.println("____________________________");
		String str3=new String("124");
		int num2=Integer.parseInt(str3);
		String str4=new String("124A");
		int num3=Integer.parseInt(str4);//Exception in thread "main" java.lang.NumberFormatException: For input string: "124A"
		System.out.println(str3+" "+str4);

	}

}

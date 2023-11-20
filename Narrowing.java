package org.main.practice;

public class Narrowing {
	double num1=10.0d;
	int num2=(int)num1;
	public void printNum() {
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		/*num1 : 10.0
		num2 : 10
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Narrowing narr=new Narrowing();
		narr.printNum();

	}

}

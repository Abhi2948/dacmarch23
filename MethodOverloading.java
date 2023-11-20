package org.main.practice;

public class MethodOverloading {
	public void sum(int num1,int num2) {
		int num3=num1+num2;
		System.out.println(num3);
		
	}
	public int sum(int num4,int num5,int num7) {
		int num6=num4+num5+num7;
		return num6;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mo = new MethodOverloading();
		mo.sum(10,20);
		mo.sum(100,20,12);
		int result = mo.sum(100, 20, 12);
        System.out.println(result);

	}

}

//package org.main.practice;
//
//public class InstanceVar {
//
//	private int num1 = 10;// instance variable
//
//	int num5=num1; // Initialization
//	num5=11;// Assignment
//	num5=12;// can do assignment multiple times.
//	private static int num2 = 30;// static variable
//
//	public void setnum1(int num1) {
//		this.num1=num1;
//	}
//
//	public static void setnum2(int num2) {
//		this.num2=num2;// cannot use the this keyword in a static method
//	}
//
//	public static void setNum2(int num2) {
//        InstanceVar.num2 = num2;
//    }
//
//	public static void main(String args[]) {
//		int num3=40;//method local variable.
//		static num4=40;//can not declare method local variable static
//		InstanceVar.setNum2(20);
//		InstanceVar instance = new InstanceVar(); // Create an instance of the class (not shown in the provided code)
//		System.out.println("num1: " + instance.num1); // This will print "num1: 10" (the initial value)
//		System.out.println("num1: " + num1);//Cannot make a static reference to the non-static field num1
//		System.out.println("num1: " + this.num1);//Cannot use this in a static context
//		System.out.println("num2: " + InstanceVar.num2); // This will print "num2: 20" (the updated value)
//	}
//
//}}

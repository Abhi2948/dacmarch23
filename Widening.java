package org.main.practice;

public class Widening {
    int num1 = 10;
    double num2 = (double) num1;//explicit 
    double num3 =  num1;//explicit type casting is optional

    public void printNum1() {
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("num3: " + num3);
//        num1: 10
//        num2: 10.0
//      num3: 10.0
    }

    public static void main(String[] args) {
        Widening wid = new Widening();
        wid.printNum1();
    }
}

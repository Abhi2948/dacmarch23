import java.util.Scanner;
public class ASSIGN1_26 {
    /**Write a program to find minimum and maximum number as well as 
to add two float numbers using methods of Float. */
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the two numbers : ");
    float a=s.nextFloat();
    float b=s.nextFloat();
    System.out.println("the maximum numbers : "+Float.max(a,b));
    System.out.println("the maximum numbers : "+Float.min(a,b));
    System.out.println("the maximum numbers : "+Float.sum(a,b));


 }

}

import java.util.Scanner;
public class ASSIGN1_18 {
    /**Write a program to find minimum and maximum number as well as 
to add two integer numbers using methods of Integer.
 */public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the two numbers : ");
    int a=s.nextInt();
    int b=s.nextInt();
    System.out.println("the maximum numbers : "+Integer.max(a,b));
    System.out.println("the maximum numbers : "+Integer.min(a,b));
    System.out.println("the maximum numbers : "+Integer.sum(a,b));


 }

}

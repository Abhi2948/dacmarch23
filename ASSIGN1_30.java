import java.util.Scanner;
public class ASSIGN1_30 {/**Write a program to find minimum and maximum number as well as 
    to add two double numbers using methods of Double */
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the two numbers : ");
        double a=s.nextDouble();
        double b=s.nextDouble();
        System.out.println("the maximum numbers : "+Double.max(a,b));
        System.out.println("the maximum numbers : "+Double.min(a,b));
        System.out.println("the maximum numbers : "+Double.sum(a,b));
    
    
     }
    
    
}

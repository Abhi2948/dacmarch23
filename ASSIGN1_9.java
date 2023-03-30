public class ASSIGN1_9 {
    /**Write a program to convert state of Byte instance into byte, 
short, int. long, float and double */
public static void main(String args[]){
    byte a=125;
    Byte b=new Byte(a);
    byte c=b.byteValue();
    System.out.println("Byte is "+c);
    short d=b.shortValue();
    System.out.println("Short is"+d);
    int e=b.intValue();
    System.out.println("Int is "+e);
    float f=b.floatValue();
    System.out.println("float is "+f);
    double g=b.byteValue();
    System.out.println("double is "+g);
   
}
    
}

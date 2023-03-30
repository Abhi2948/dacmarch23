public class ASSIGN1_14 {/**Write a program to convert state of Short instance into byte, 
    short, int, long, float and double. */
    public static void main(String args[]){
        short s=125;
    Short a=new Short(s);
    byte c=a.byteValue();
    System.out.println("Byte is "+c);
    short d=a.shortValue();
    System.out.println("Short is "+d);
    int e=a.intValue();
    System.out.println("Int is "+e);
    float f=a.floatValue();
    System.out.println("float is "+f);
    double g=a.byteValue();
    System.out.println("double is "+g);

    }
    
    
}

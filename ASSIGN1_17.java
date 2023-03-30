public class ASSIGN1_17 {/**Write a program to convert state of Integer instance into 
    byte, short, int, long, float and double */
    public static void main(String args[]){
        int a=12;
        Integer b=new Integer(a);
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

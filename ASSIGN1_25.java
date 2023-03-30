public class ASSIGN1_25 {/**Write a program to convert state of Float instance into byte, 
    short, int, long, float and double */
    public static void main(String args[]){
        float a=20;
        Float b=new Float(a);
        byte c=b.byteValue();
        System.out.println("Byte is "+c);
        short d=b.shortValue();
        System.out.println("Short is"+d);
        int e=b.intValue();
        System.out.println("Int is "+e);
        long l=b.intValue();
        System.out.println("long is "+l);
        float f=b.floatValue();
        System.out.println("float is "+f);
        double g=b.byteValue();
        System.out.println("double is "+g);
       
    }
    
}

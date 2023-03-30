public class ASSIGN1_8 {
    /**
     * Write a program to convert:
a. byte value into String
b. byte value into Byte instance.
c. String instance into Byte instance
     */
    public static void main(String args[]){
        byte b=2;
    String s1 = String.valueOf(b);
    System.out.println("byte value into String"+s1); 
    Byte c=new Byte(b);
    System.out.println("byte value into Byte instance."+c); 
    String d=new String("2");
    Byte e=new Byte(d);
    System.out.println("String instance into Byte instance"+e); 
    

    }
    
    
}

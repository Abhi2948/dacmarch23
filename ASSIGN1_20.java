public class ASSIGN1_20 {/**Write a program to convert:
    a. long value into String
    b. long value into Long instance.
    c. String instance into Long instance.
    d. long value into binary, octal and hexadecimal string. */
    public static void main(String args[]){
        long l=12;
       
        String s=String.valueOf(l);
        System.out.println("long value into String "+s); 
        long b=new Long(l);   
        System.out.println("long value into long instance. "+b); 
        String c=new String("125");  
        long d=new Long(c); 
        System.out.println("String instance into long instance."+d);
        String hexa = Long.toHexString(l);
           System.out.println("HexaDecimal Value is : " + hexa);
           String octal = Long.toOctalString(l);
           System.out.println("Octal Value is : " + octal);
           String binary = Long.toBinaryString(l);
           System.out.println("Binary Value is : " + binary);
    
    }
    
}

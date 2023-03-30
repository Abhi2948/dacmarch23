public class ASSIGN1_16 {/**Write a program to convert:
    a. int value into String
    b. int value into Integer instance.
    c. String instance into Integer instance.
    d. int value into binary, octal and hexadecimal string */
    public static void main(String args[]){
        int i=125;
       
        String s=String.valueOf(i);
        System.out.println("int value into String "+s); 
        int b=new Integer(i);   
        System.out.println("int value into Integer instance. "+b); 
        String c=new String("125");  
        int d=new Integer(c); 
        System.out.println("String instance into Integer instance."+d);
        String hexa = Integer.toHexString(i);
           System.out.println("HexaDecimal Value is : " + hexa);
           String octal = Integer.toOctalString(i);
           System.out.println("Octal Value is : " + octal);
           String binary = Integer.toBinaryString(i);
           System.out.println("Binary Value is : " + binary);
    
    }
    
}

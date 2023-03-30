public class ASSIGN1_28 {/**Write a program to convert:
    a. double value into String
    b. double value into Double instance.
    c. String instance into Double instance.
    d. double value into binary, octal and hexadecimal 
    string(Note: Here you can use doubleToLongBits() method 
    along with methods of Long class). */
    public static void main(String args[]){
        double l=13.0;
       
        String s=String.valueOf(l);
        System.out.println("double value into String "+s); 
        double b=new Double(l);   
        System.out.println("double value into double instance. "+b); 
        String c=new String("13");  
        double d=new Double(c); 
        System.out.println("String instance into long instance."+d);
        long hexa = Double.doubleToLongBits(l);
           System.out.println("HexaDecimal Value is : " + hexa);
           long octal = Double.doubleToLongBits(l);
           System.out.println("Octal Value is : " + octal);
           long binary = Double.doubleToLongBits(l);
           System.out.println("Binary Value is : " + binary);
    
    }
}

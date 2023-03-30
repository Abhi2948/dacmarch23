public class ASSIGN1_24 {/**Write a program to convert:
    a. float value into String
    b. float value into Float instance.
    c. String instance into Float instance.
    d. float value into hexadecimal string. */
    public static void main(String args[]){
        float s=12;
        String a=String.valueOf(s);
        System.out.println("float value into String "+a); 
        Float b=new Float(s);
        System.out.println("float value into float instance "+b);
        String d=new String("12");
        Float e=new Float(d);
        System.out.println("String instance into Short instance "+e);
        String hexa = Float.toHexString(s);
        System.out.println("HexaDecimal Value is : " + hexa);
    }
    
}

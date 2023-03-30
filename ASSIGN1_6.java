public class ASSIGN1_6 {
    /**Write a program to perform below operations on Boolean type to 
convert:
a. boolean value into String
b. boolean value into Boolean instance.
c. String value into boolean value
d. String value into Boolean instance.
 */
    public static void main(String args[]){
    //boolean value into String
    boolean b1 = true;//instance var
    boolean b2 = false;//instance var
    String s1 = String.valueOf(b1);
    String s2 = String.valueOf(b2);
    System.out.println(s1);    
    System.out.println(s2); 
    System.out.println("_____________________________1"); 
    //boolean value into Boolean instance
    Boolean b3=new Boolean("true");
    Boolean b4=new Boolean("false");
    System.out.println(b3);    
    System.out.println(b4);
    System.out.println("_____________________________2"); 
    //String value into boolean value
    String s3="true";
    String s4="false";
    boolean b5=Boolean.valueOf(s3);
    boolean b6=Boolean.valueOf(s4);
    System.out.println(b5);    
    System.out.println(b6);  
    System.out.println("_____________________________3");  
    //String value into Boolean instance. 
    Boolean b7=new Boolean("true");
    Boolean b8=new Boolean("false");
    System.out.println(b7);    
    System.out.println(b8);  
    System.out.println("_____________________________4");
    }

    
}

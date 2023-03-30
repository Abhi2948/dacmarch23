public class ASSIGN1_13 {/**Write a program to convert:
    a. short value into String
    b. short value into Short instance.
    c. String instance into Short instance */
    public static void main(String args[]){
        short s=12;
        String a=String.valueOf(s);
        System.out.println("short value into String "+a); 
        String b=new String("s");
        System.out.println("short value into String instance "+b);
        String d=new String("12");
        Short e=new Short(d);
        System.out.println("String instance into Short instance "+e);
    }
    
}

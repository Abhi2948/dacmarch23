public class ASSIGN1_10 {/**Write a program to perform below operations on char type to 
    get:
    a. The number of bits used to represent a char value
    b. The number of bytes used to represent a char value
    c. The minimum value a char
    d. The maximum value a char */
    public static void main(String[] args) {
        System.out.println("Size  : "+ Character.SIZE); //16
        System.out.println("BYTES : "+ Character.BYTES);//2
        System.out.println("MIN_VALUE : "+ (int)Character.MIN_VALUE);
        System.out.println("MAX_VALUE : "+ (int)Character.MAX_VALUE);
      }  
    
}

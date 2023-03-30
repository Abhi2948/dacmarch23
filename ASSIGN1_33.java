public class ASSIGN1_33 {/**Pass integer, float and double value from command line. Parse 
    it appropriately and perform arithmetic operations (+,-,*,/)
    on it. */
    
        public static void main(String[] args) {
          int num1 = Integer.parseInt(args[ 0 ]);
          float num2 = Float.parseFloat(args[ 1 ]) ;
          double num3 = Double.parseDouble(args[ 2 ]) ;
          double result1 = num1 + num2 + num3;
          double result2=num1-num2-num3;
          double result3=num1*num2*num3;
          double result4=num1/num2/num3;

          System.out.println("Result1  : "+result1);
          System.out.println("Result2  : "+result2);
          System.out.println("Result3  : "+result3);
          System.out.println("Result4  : "+result4);
        }
        // public static void main1(String[] args) {
        //   int num1 = Integer.parseInt(args[ 0 ]);
        //   int num2 = Integer.parseInt(args[ 1 ]) ;
        //   int result = num1 + num2;
        //   System.out.println("Result  : "+result);
        // }  
      }
      
    


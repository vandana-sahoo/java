 class CharConvert{
     public static void main(String[] args) {
      /* char ch = 'c';
        if (ch >= 'A' && ch <= 'Z' && ch >= 'a' && ch <= 'z' ) { 
        System.out.println("Lowercase: " + (char) (ch + 32));
        } else {
           System.out.println("Uppercase: " + (char) (ch - 32));
        } */

          
    
     //Sum of all even numbers and product of all odd numbers from m to n
       int productOdd = 1;
      sumEven = 0;
       for (int i = m; i <= n; i++) {
           if (i % 2 == 0) {
              sumEven += i;
            } else {
               productOdd *= i;
           }
       }

        System.out.println("Sum of even numbers: " + sumEven);
       System.out.println("Product of odd numbers: " + productOdd);


        }
    }

    
     
        
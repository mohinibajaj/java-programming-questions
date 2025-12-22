package org.example;

public class ReverseAnIntegerOverAndUnderFlow {
    public static void main(String[] args) {

            long number = -1234567890123456789L;
            int reverse = 0;

// casting digit into iNTGER, as number is long
            int digit = (int) number % 10;
            while (number !=  0 ){

                if (reverse > Integer.MAX_VALUE / 10 || reverse == Integer.MAX_VALUE / 10 && digit > 7 ){
                    System.out.println("max value exists");
                    System.exit(0);
                }

                if(reverse > Integer.MIN_VALUE / 10 || reverse == Integer.MIN_VALUE / 10 && digit < -8 ){
                    System.out.println("min value exists");
                    System.exit(0);
                }

                reverse = reverse * 10 + digit;
                number = number / 10;
            }

            System.out.println("print reverse : " + reverse);
        }
}

//f number is declared as long (which it must be for large values), then:
//        * number % 10 produces a long result.
//You are trying to assign that long result to an int variable (digit).
 //Java does not allow implicit narrowing conversions from long to int because it could lose data.
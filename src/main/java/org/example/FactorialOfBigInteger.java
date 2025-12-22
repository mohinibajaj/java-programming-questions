package org.example;
import java.math.BigInteger;

public class FactorialOfBigInteger {

        public static void main(String[] args) {

            int n = 50;
            BigInteger fact = BigInteger.ONE;

            for (int i = 1; i <= n ; i++){
                fact = fact.multiply(BigInteger.valueOf(i))  ;

            }

            System.out.println("print factorial : " + fact);
        }
}

package org.example;

public class Factorial {
        public static void main(String[] args) {

            int n = 50;
            int fact = 1;
            for (int i = 1; i <= n ; i++){
                fact = fact * i;

            }

            System.out.println("print factorial : " + fact);
        }
    }

// in this case, for factorial 0 , it will give answer as 1 which is correct as
// 0 is not getting accepted in for loop , hence fact = fact * i will never be called
// and hence, fact=1 will print.


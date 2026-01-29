package org.example;

public class ReverseAnInteger {


        public static void main(String[] args) {

            int number = 230;
            int reverse = 0;

            while (number !=  0 ){

                reverse = reverse * 10 + number % 10;
                number = number/10;
            }

            System.out.println("print reverse : " + reverse);
        }

}

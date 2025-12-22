package org.example;

public class EvenOrOddWord {
    public static void main(String[] args) {

        String s = "JAVA";

        int count =  s.length();
        if (count % 2 == 0 ){

            System.out.println("even length");
        }
        else {
            System.out.println("odd length");
        }

    }
}

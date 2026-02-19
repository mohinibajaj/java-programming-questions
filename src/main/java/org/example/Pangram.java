package org.example;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

    public static void main(String[] args) {

        String  s = "the quick brown fox jumps over the lazy dog";

        char[] c = s.toCharArray();


        Set<Character> set = new HashSet<>();
        for(int i= 0 ; i < c.length ; i ++){

            if(c [i] >= 'a' && c[i] <= 'z'){
                set.add(c[i]);
            }


        }

        if (set.size() == 26){
            System.out.println("Valid Pangram");
        }
        else
        {
            System.out.println("Not a Pangram");
        }
    }
}

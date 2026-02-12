package org.example;

import java.util.HashMap;

public class FrequencyOfSpecialCharacter {

    public static void main(String[] args) {

        String str = "Hello@123!! Bye#";

       char[] arr = str.toCharArray() ;

     HashMap< Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : arr){
            if (!Character.isLetterOrDigit(ch) && (!Character.isWhitespace(ch)))
            {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0 ) + 1);
            }

        }
        System.out.println(frequencyMap);
    }
}

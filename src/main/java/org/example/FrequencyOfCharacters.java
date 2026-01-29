package org.example;

import java.util.HashMap;

class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "Madam";

        //convert a string into an array
        char[] arr = str.toCharArray();

        HashMap < Character, Integer> map = new HashMap<>();

        for ( char ch : arr ) {
            map.put (ch, map.getOrDefault(ch , 0 ) + 1);

        }
        System.out.println(map);
    }
}

//Output should be like this {a=2, d=1, M=1, m=1} as Java is case sensitive
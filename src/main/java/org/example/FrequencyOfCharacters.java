package org.example;

import java.util.HashMap;
import java.util.Map;

class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "Madam";

        //convert a string into an array
        char[] arr = str.toCharArray();

        HashMap < Character, Integer> map = new HashMap<>();

        for ( char ch : arr ) {
            map.put (ch, map.getOrDefault(ch , 0 ) + 1);

        }

        //OR

        // 2. Use entryset to print single single values

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println(map);
    }
}

//Output should be like this {a=2, d=1, M=1, m=1} as Java is case sensitive
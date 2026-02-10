package org.example;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacters {

    public static void main(String[] args) {


        String s = "swiss";
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : arr){
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }

        // 1. First method
        for(char ch : arr){
            if(map.get(ch) == 1){
                System.out.println("First non-repeating character: " + ch);
                return;
                //break exits the loop, not the method and Once return runs, main ends
        }
    }

        //OR

        // 2. use MAP.ENTRY for single entry

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("First non-repeating character: " + entry.getKey());
                return;
            }
        }
        System.out.println("No non-repeating character found");

    }
}

package org.example;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {

    public static void main(String[] args) {

        String s = "success";

        char[] arr = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();



        char mostFrequent = s.charAt(0);
        int maxCount = 0;
        for (char ch : arr){

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if(map.get(ch) >  maxCount){
                maxCount = map.get(ch);
                mostFrequent = ch;

            }
        }
        System.out.println("Most frequent character: " + mostFrequent);
        System.out.println("Frequency: " + maxCount);
    }

}

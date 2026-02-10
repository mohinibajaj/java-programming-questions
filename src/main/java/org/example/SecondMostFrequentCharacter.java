package org.example;

import java.util.HashMap;
import java.util.Map;

public class SecondMostFrequentCharacter {

    public static void main(String[] args) {


        String s = "abbbcc";

        char[] arr = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();


        Character firstChar = null;
        Character secondMostChar = null;
        int secondMaxCount = 0;
        int firstMax = 0;

        for (char ch : arr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                int count = entry.getValue();
                char ch = entry.getKey();

            if(count > firstMax){

                secondMaxCount = firstMax;
                secondMostChar = firstChar;

                firstMax = count;
                firstChar = ch;

            }

            else if (count > secondMaxCount && count < firstMax) {
                secondMaxCount = count;
                secondMostChar = ch;
            }

        }

        if (secondMaxCount == 0) {
            System.out.println("No second most frequent character.");
        }
        else {

        System.out.println("Second Most frequent character: " + secondMostChar);
        System.out.println("Second Frequency: " + secondMaxCount);
    }}
}

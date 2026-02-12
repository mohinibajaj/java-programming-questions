package org.example;

import java.util.HashMap;
import java.util.Map;

public class ABBCCCDDDDEEEEE {

    public static void main(String[] args) {

        String s = "ABBCCCDDDDEEEEE";
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : arr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            System.out.println("Alphabets: " + entry.getKey() + " and its respective count : " + entry.getValue());

        }
    }
}

package org.example;

import java.util.HashMap;
import java.util.Map;

public class ReverseAMap {

    public static void main(String[] args) {

        Map<Integer, String> original = new HashMap<>();
         original.put(1, "A");
        original.put(2, "B");
        original.put(3, "C");

        Map<String, Integer> reversed = new HashMap<>();

        for(Map.Entry<Integer, String> entry : original.entrySet()){

            reversed.put(entry.getValue(), entry.getKey());

        }

        System.out.println(reversed);
    }
}

package org.example;

import java.util.HashMap;
import java.util.Map;

public class CountWordFrequencyInParagraph {

    public static void main(String[] args) {

        String paragraph = "Java is great. java is powerful, and Java is popular!";


        // to avoid the punctuation ie, popular!
//        paragraph = paragraph.toLowerCase().replaceAll("[^a-z ]", "");


        // To treat both Java and java as different word
        paragraph = paragraph.replaceAll("[^a-zA-Z ]", "");


        String[] words = paragraph.split("\\s+");
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

//            System.out.println(entry);

            System.out.println(entry.getKey() + " -> " + entry.getValue());


        }
    }
}

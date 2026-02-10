package org.example;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacter {

    public static void main(String[] args) {

        String s = "programming";
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();


        for(char ch : arr){

            map.put(ch, map.getOrDefault(ch,0) + 1);
        }


        for(Map.Entry<Character, Integer> entry : map.entrySet()){

           if( entry.getValue() == 1){

               System.out.println(entry);

               // to print only the keys, ie. characters
               System.out.println(entry.getKey());
           }
        }


        // without using entryset way
//        for(char ch : arr){
//            if(map.get(ch) == 1){
//                System.out.println(ch);
//
//            }
//        }

    }

}

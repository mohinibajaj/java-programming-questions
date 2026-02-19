package org.example;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {


    public static void main(String[] args) {

        int[] arr = { 16,17,3,5,7,2};

        List<Integer> leaders = new ArrayList<>();

        int maxFromRight = arr[arr.length - 1];
        leaders.add(maxFromRight);
        for (int i = arr.length - 2 ; i >= 0 ; i -- ){
            if (arr[i] > maxFromRight ){

                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }

        System.out.println(leaders);
    }

}

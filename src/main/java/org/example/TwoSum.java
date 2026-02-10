package org.example;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();

        int[] nums = {1, 2, 3, 5, 4, 1, 5};
        int target = 10;
        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {

                // to print indices

                System.out.println("Pair found at indices: " + map.get(complement) + " and " + i);

                //to print values
                System.out.println("Pair found at indices: " + complement + " and " + nums[i]);

                return;
            }
            map.put(nums[i], i);
        }
        System.out.println("No combination found");
    }
}

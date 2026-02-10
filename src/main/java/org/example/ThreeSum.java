package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] num, int target) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(num);

        int n = num.length;
        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && num[i] == num[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;
            while (left < right) {

                int sum = num[i] + num[left] + num[right];

                if (sum == target) {

                    result.add(Arrays.asList(num[i], num[left], num[right]));

                    while (left < right && num[left] == num[left + 1]) left++;
                    while (left < right && num[right] == num[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] num = {1, -1, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> answer = threeSum(num, target);
        System.out.println("Target is : " + target);
        System.out.println("Triplets are " + answer);

        // to print line by line all the triplets
        for (List<Integer> triplet : answer) {
            System.out.println(triplet);
        }
    }
}

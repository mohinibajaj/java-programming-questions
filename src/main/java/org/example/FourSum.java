package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public static List<List<Integer>> fourSum(int[] num, int target) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(num);

        for (int i = 0; i < num.length - 3; i++) {
            if (i > 0 && num[i] == num[i - 1])
                continue;

            for (int j = i + 1; j < num.length - 2; j++) {
                if (j > i + 1 && num[j] == num[j - 1])
                    continue;

                int left = j + 1;
                int right = num.length - 1;


                while (left < right) {

                    long sum = (long) num[i] + num[j] + num[left] + num[right];
                    if (sum == target) {

                        result.add(Arrays.asList(num[i], num[j], num[left], num[right]));

                        while (left < right && num[left] == num[left + 1]) left++;
                        while (left < right && num[right] == num[right - 1]) right--;

                        left++;
                        right--;
                    } else if (sum > target) {

                        right--;
                    } else {
                        left++;
                    }
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] num = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> answer = fourSum(num, target);
        System.out.println("Quadruplets that sum to " + target + ":");

        for (List<Integer> quad : answer) {
            System.out.println(quad);
        }


    }
}

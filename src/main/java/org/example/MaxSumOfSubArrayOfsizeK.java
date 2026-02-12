package org.example;

public class MaxSumOfSubArrayOfsizeK {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8 };

        int k = 5;
        int maxSum;
        int windowSum = 0;

        for (int i=0; i< k ; i ++){

            windowSum = windowSum + arr[i];

            //or
            // windowSum += arr[i];
        }

        maxSum = windowSum;
        for(int i = k ; i < arr.length ; i ++ ){

            windowSum = windowSum + arr[i] - arr[i-k];


            if (windowSum > maxSum) {
                maxSum = windowSum;
            }

            //OR

            // maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println(maxSum);

    }
}

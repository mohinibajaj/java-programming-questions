package org.example;

import java.util.Arrays;

public class AverageOfSubArrayOfSizeK {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 1, 2, 4, 3};


        //  Integer k = 3;
        // int is stored directly in memory and int cannot be null.
       //  Integer is an object. Objects live on heap. More overhead. Also, it can be null

        //Wrapper is used when working with collections like List<Integer>.

        int k = 3;

        double[] avg = new double[arr.length - k + 1];

        //arr.length - k + 1 --- that’s how many windows of size k exist
        //8-3+1 = 6, there will be total 6 windows of size 3 and 6 average will be in the output
        //i.e. [2.6, 4.0, 3.3, 2.6, 2.33, 3.0]

        int windowSum = 0;

        for (int i = 0; i < k; i++) {

            windowSum = windowSum + arr[i];
        }

        avg[0] = windowSum / (double) k;


        for (int i = k; i < arr.length; i++) {

            windowSum = windowSum + arr[i] - arr[i - k];

            avg[i-k +1 ] = windowSum / (double) k;

//            System.out.println(String.format("%.2f", avg[i - k + 1]));
            // this will only print 5 avgs instead of 6 because since this is still loop, it avoids avg[0]

        }

        System.out.println(Arrays.toString(avg));

        for(double value : avg){
            System.out.println(String.format("%.2f", value));
        }


    }

}

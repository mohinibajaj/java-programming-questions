package org.example;

public class MaxAverageOfSubArrayOfSizeK {

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,1,2,4,3};

        int k = 3;

        double avg;

        int windowSum = 0;
        double windowAvg;

        for(int i=0; i < k ; i ++){

            windowSum =  windowSum + arr[i] ;
        }

        avg = windowSum / (double) k;


       for(int i = k ; i < arr.length ; i ++ ){

           windowSum = windowSum + arr[i] - arr[i-k] ;

           windowAvg = windowSum / ( double ) k;

           if(avg < windowAvg){

               avg = windowAvg;
           }
       }

        System.out.println(avg);
    }
}

package org.example;

public class SumOfAnArray {
    public static void main(String[] args) {

        int[] num = {1,2,3,4,5};
        int sum = 0;

        for(int i = 0; i <= num.length ; i++){

            sum = sum + i;

        }
        System.out.println("print" + sum);
    }
}

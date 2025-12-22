package org.example;

public class SecondLargest {
        public static void main(String[] args) {

            int[] num = {1,2,3,4,5};
            int max = 0;
            int secondMax = 0;

            for(int i = 0; i < num.length ; i++){

                if (max < num[i]){


                    secondMax = max;
                    max = num[i];
                }

            }
            System.out.println("print Max" + max);
            System.out.println("print secondMax" + secondMax);
        }
    }


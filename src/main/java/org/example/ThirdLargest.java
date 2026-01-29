package org.example;

class ThirdLargest {
    public static void main(String[] args) {

        int[] num = {7,1,3,2,4,5};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for(int i = 0; i < num.length ; i++){

            if (max < num[i]){
                thirdMax = secondMax;
                secondMax = max;
                max = num[i];}
            else if ( secondMax < num[i] && num[i] != max ){
                thirdMax = secondMax;
                secondMax = num[i];
            }
            else if ( thirdMax < num[i] && num[i] != max && num[i] != secondMax ){
                thirdMax = num[i] ; }
        }
        System.out.println("print Max" + max);
        System.out.println("print secondMax" + secondMax);
        System.out.println("print thirdMax" + thirdMax);
    }
}

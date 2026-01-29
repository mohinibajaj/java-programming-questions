package org.example;

class ThirdSmallest {
    public static void main(String[] args) {

        int[] num = {7,1,3,2,4,5};
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int thirdMin = Integer.MAX_VALUE;

        for(int i = 0; i < num.length ; i++){

            if (min > num[i]){
                thirdMin = secondMin;
                secondMin = min;
                min = num[i];}
            else if ( secondMin > num[i] && num[i] != min ){
                thirdMin = secondMin;
                secondMin = num[i];
            }
            else if ( thirdMin > num[i] && num[i] != thirdMin && num[i] != secondMin ){
                thirdMin = num[i] ; }
        }
        System.out.println("print min" + min);
        System.out.println("print secondMin" + secondMin);
        System.out.println("print thirdMin" + thirdMin);
    }
}
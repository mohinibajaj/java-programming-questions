package org.example;

public class RemoveDuplicatesInArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,2,4,1,5};

        int n = arr.length;

        for(int i=0; i<n; i++){

            for(int j=i+1; j<n; j++){

                if(arr[i] == arr[j]){
                    arr[j] = -1; // mark duplicate
                }
            }
        }

        for(int num : arr){
            if(num != -1){
                System.out.print(num + " ");
            }
        }
    }
}

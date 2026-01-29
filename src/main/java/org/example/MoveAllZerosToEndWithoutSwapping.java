package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class MoveAllZerosToEndWithoutSwapping {
    public static void main(String[] args) {

        int[] a = {1, 0, 2, 0, 3, 0};
        int put = 0;

        for(int current = 0; current < a.length ; current++){
            if (a[current] != 0 ){
                a[put]  = a[current];
                put++;
            }}
        while(put < a.length){
            a[put] = 0;
            put ++;
        }
        for (int n : a ){
            System.out.print( n + " ");
        }
    }
}
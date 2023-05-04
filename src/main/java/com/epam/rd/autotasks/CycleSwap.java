package com.epam.rd.autotasks;

import java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if (array!=null&&array.length>0){
            for(int i = 0; i < 1; i++){
                int j, last;
                //Stores the last element of array
                last = array[array.length-1];

                for(j = array.length-1; j > 0; j--){
                    //Shift element of array by one
                    array[j] = array[j-1];
                }
                //Last element of array will be added to the start of array.
                array[0] = last;
            }
        }

    }

    static void cycleSwap(int[] array, int shift) {

        if (array!=null&&array.length>0){
            for(int i = 0; i < shift; i++){
                int j, last;
                //Stores the last element of array
                last = array[array.length-1];

                for(j = array.length-1; j > 0; j--){
                    //Shift element of array by one
                    array[j] = array[j-1];
                }
                //Last element of array will be added to the start of array.
                array[0] = last;
            }
        }
        
    }
}

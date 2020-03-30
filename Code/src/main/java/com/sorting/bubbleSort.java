package com.sorting;

import java.util.Arrays;

/* ****************************************** *
 * @author : Ndumiso Onke Fanti               *
 * ****************************************** */
    // [100, 4,6,2,9,1]
    // [4, 100, 6,2,9,1
public class bubbleSort {
    public static void main(String... args) {
        int[] arr = new int[]{2,5,1,0,-6,100,16,4}; // come back

        for(int lastUnsortedIndex = arr.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for (int i = 0; i <lastUnsortedIndex; i ++){
                if(arr[i] > arr[i +1]){
                    swap(arr, i, i +1);
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    private static void swap(int[] arr, int i, int j){
        if(i == j){

        }else {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }

}
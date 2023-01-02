package com.dsa.sorting;

import com.dsa.common.InputArrayFromCmdLine;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = InputArrayFromCmdLine.getInputFromCmdLine();
        cyclicSort(arr);
        System.out.println("Array is :"+ Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr) {
        int i = 0;
        while( i < arr.length){
            if(arr[i] == (i+1))
                i++;
            else{
                int temp =arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }
        }
    }
}

package com.dsa.sorting;

import com.dsa.common.InputArrayFromCmdLine;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = InputArrayFromCmdLine.getInputFromCmdLine();
        insertionSort(arr);
        System.out.println(arr.length);
        System.out.println("Array is: "+ Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else if(arr[j-1] < arr[j])
                    break;
            }
        }
    }
}

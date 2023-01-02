package com.dsa.sorting;

import com.dsa.common.InputArrayFromCmdLine;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = InputArrayFromCmdLine.getInputFromCmdLine();
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
           int lastIndex = arr.length-(i+1);
           int maxInd = getMaxInd(arr,0,lastIndex);
            swapMaxToLastIndex(arr, lastIndex, maxInd);
        }
    }

    private static void swapMaxToLastIndex(int[] arr, int lastIndex, int maxInd) {
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[maxInd];
        arr[maxInd]=temp;
    }

    private static int getMaxInd(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i])
                max=i;
        }
        return max;
    }

}

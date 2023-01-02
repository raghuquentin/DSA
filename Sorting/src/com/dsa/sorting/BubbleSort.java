package com.dsa.sorting;

import com.dsa.common.InputArrayFromCmdLine;

import java.util.logging.Logger;

public class BubbleSort {
    static Logger log = Logger.getLogger(BubbleSort.class.getName());
    public static void main(String[] args) {
        int[] arr = InputArrayFromCmdLine.getInputFromCmdLine();
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-(i+1); j++) {
                int k=j+1;
                if(arr[j] > arr[k]){
                    int temp = arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                }
            }
        }
        System.out.printf("Sorted array..................");
        for (int i:arr
             ) {
            System.out.print(i+" :");
        }
    }
}
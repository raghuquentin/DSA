package com.dsa.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

//MergeSort with extra arrays
//Using Divide and Conquer approach
public class MergeSortWIthExtraArray {
    public static void main(String[] args) {
        int[] arr = {12,13,7,6,5};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] mergeSort(int[] arr) {
        //return when arr length is 1
        if(arr.length ==1){
            return arr;
        }
        //finding middle element index
        int mid = arr.length/2;
        //dividing arrays to left and right by mid index
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        //once we got left and right array then merging those arrays
        return merge(left,right);
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length+arr2.length];
        //initialize 3 points
        //pointer for arr1
        int i=0;
        //pointer for arr2
        int j=0;
        //pointer for arr3
        int k=0;

        //case1
        //arr1 pointer and arr2 pointer should not go out of bound of their arrays
        while (i<arr1.length && j<arr2.length){
            if(arr1[i] <arr2[j]){
                arr3[k]=arr1[i];
                i++;
            }else {
                arr3[k]=arr2[j];
                j++;
            }
            k++;
        }
        //case 2
        //if j pointer goes out of arr2, then we no need to check anything, copying all
        //the elements of arr1 to arr3
        while(i<arr1.length){
            arr3[k]=arr1[i];
            i++;
            k++;
        }

        //case 3
        //if i pointer goes out of arr1, then we no need to check anything, copying all
        //the elements of arr2 to arr3
        while (j<arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        return  arr3;
    }
}

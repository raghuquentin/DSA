package com.dsa.array;

import java.util.Arrays;
//Merging two sorted arrays
public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1={3,5,12,19};
        int[] arr2={7,10,13,15,17,20};
        mergerArrays(arr1,arr2);
    }

    private static void mergerArrays(int[] arr1,int[] arr2) {
        //create merge array
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
        System.out.println(Arrays.toString(arr3));
    }
}

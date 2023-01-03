package com.dsa.array;

//check if the given array is sorted by recursion
public class Sorted {
    public static void main(String[] args) {
        int[] arr ={1,5,12,9,10};
        System.out.println(isSorted(arr,0));
    }

    private static boolean isSorted(int[] arr, int i) {
        if(i>arr.length-2)
            return true;

        return arr[i]<arr[i+1] && isSorted(arr,i+1);
    }
}
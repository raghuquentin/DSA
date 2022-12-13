package com.dsa.sorting;

import com.dsa.common.InputArrayFromCmdLine;

import java.util.logging.Logger;

public class BubbleSort {
    static Logger log = Logger.getLogger(BubbleSort.class.getName());
    public static void main(String[] args) {
        int[] arr = InputArrayFromCmdLine.getInputFromCmdLine();
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
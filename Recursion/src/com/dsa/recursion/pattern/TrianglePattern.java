package com.dsa.recursion.pattern;

public class TrianglePattern {
    public static void main(String[] args) {
        printReversePattern(5,0);
        printForwardPattern(5,0);

    }

    private static void printReversePattern(int row, int col) {
        if(row <=0)
            return;
        if(col<row){
            System.out.print("*");
            printReversePattern(row,col+1);
        }else{
            System.out.println();
           printReversePattern(row-1,0);
        }
    }

    private static void printForwardPattern(int row, int col) {
        if(row <=0)
            return;
        if(col<row){
            printForwardPattern(row,++col);
            System.out.print("*");
        }else{
            printForwardPattern(--row,0);
            System.out.println();
        }

    }
}
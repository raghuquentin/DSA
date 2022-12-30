package com.dsa.recursion;

//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class StepsToZero {
    public static void main(String[] args) {
        int number = 123;
        int count= 0;
        System.out.println(getNoOfStepsToZero(number,count));
    }

    private static int getNoOfStepsToZero(int number, int count) {
        //base condition
        if(number<=0){
            return count;
        }
        //checking even or odd
        if( number %2 ==0){
            number = number/2;
        }else{
            number = number-1;
        }
        //counting steps
        count = count+1;
        return getNoOfStepsToZero(number,count);
    }
}

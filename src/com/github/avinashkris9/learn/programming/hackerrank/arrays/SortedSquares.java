package com.github.avinashkris9.learn.programming.hackerrank.arrays;

import java.util.Arrays;

/*

Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]

'Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]
https://leetcode.com/explore/featured/card/fun-with-arrays/521/introduction/3240/
 */
public class SortedSquares {

  public static int[] sortedSquares(int[] A) {

  for(int i=0;i<A.length;i++)
  {
    A[i]=A[i]*A[i];
  }
    return A;
  }

  public static void main(String[] args) {
    //
    int[] arr={-7,-3,2,3,11};
   arr= sortedSquares(arr);
   Arrays.sort(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}

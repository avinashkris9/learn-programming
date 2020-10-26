package com.github.avinashkris9.learn.programming.hackerrank.arrays;
/*
https://leetcode.com/explore/featured/card/fun-with-arrays/511/in-place-operations/3260/

Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 */
public class SortArrayByParity {
  public static int[] sortArrayByParity(int[] A) {

    int evenCounter=0;
    for(int i=0;i<A.length;i++)
    {
      if(A[i]%2==0)
      {
        int temp=A[evenCounter];
        A[evenCounter++]=A[i];
        A[i]=temp;
      }
    }
    return A;
  }
  public static void main(String[] args) {

    int[] nums={3,1,2,4};
  sortArrayByParity(nums);
  UtilsClass.printArray(nums);
  }
}

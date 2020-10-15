package com.github.avinashkris9.learn.programming.misc;

/*
Maximum sum such that no two elements are adjacent
https://www.geeksforgeeks.org/maximum-sum-such-that-no-two-elements-are-adjacent/?ref=lbp
 */
public class FindMaxNonAdjecentSum {

  static int findMaxSum(int[] arr,int size)
  {
    int incl=arr[0];
    int excl=0;
    for(int i=1;i<arr.length;i++)
    {

      excl=java.lang.Math.max(incl,excl); // this number is not included, so excluded sum is either the sum including the last one or the sum excluding the last one.

      incl=excl+incl; //now we need to include current number, excl already have the  value of no adjecent number,so add it to current number.
    }
    return excl;

  }
  public static void main(String[] args) {
    int arr[] = new int[]{5, 5, 10, 100, 10, 5};
    System.out.println(findMaxSum(arr, arr.length));
  }
}

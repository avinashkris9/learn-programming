package com.github.avinashkris9.learn.programming.hackerrank.arrays;



/*
Given an array, rotate the array to the right by k steps, where k is non-negative.
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */
public class Rotate {


  static int[] rotateArray(int[] arr , int k)
  {
    int tmp=arr[0];
    int j;
    for(int i=0;i<k;i++)
    {
      arr[0]=arr[arr.length-1];
  ;
      for(j=1;j<arr.length;j++)
      {
        int v=arr[j];
        arr[j]=tmp;
        tmp=v;

      }


    }



    return arr;
  }

  static void printArray(int[] arr)
  {
    for (int i : arr) {
      System.out.print(i +" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {


    int[] arr={1,2,3,4,5,6,7};
      int k=2;
    rotateArray(arr,3);
    printArray(arr);

   int[] arr2={-1,-100,3,99};
     k=2;
    rotateArray(arr2,k);
    printArray(arr2);

  }
}

package com.github.avinashkris9.learn.programming.hackerrank.arrays;
/*

https://leetcode.com/explore/featured/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function.



Example 1:

Input: [1,0,2,3,0,4,5,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]


Note:

1 <= arr.length <= 10000
0 <= arr[i] <= 9
 */
public class DuplicateZeroes {
  static void printArray(int[] arr)
  {
    for (int i : arr) {
      System.out.print(i +" ");
    }
    System.out.println();
  }
  public static void duplicateZeros(int[] arr) {


  for(int i=0;i<arr.length-1;i++)
  {

    if(arr[i]==0)
    {
      int tmp=arr[i+1];

      arr[i+1]=0;
      i++;
        for(int j=i+1;j<arr.length;j++)
        {
          int x=arr[j];
          arr[j]=tmp;
          tmp=x;

        }

    }
  }


  }
  public static void main(String[] args) {

   int[] test={1,0,2,3,0,4,5,0};



    duplicateZeros(test);
//    System.out.println(test);
    printArray(test);
  }
}

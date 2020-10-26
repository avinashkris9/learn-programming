package com.github.avinashkris9.learn.programming.hackerrank.arrays;
/*

https://leetcode.com/explore/featured/card/fun-with-arrays/521/introduction/3238/
 */
public class ConsecutiveOnes {

  static int findMaxConsecutiveOnes(int[] nums) {
    int x=0;
    int max=x;
    for(int i=0;i<nums.length;i++)
    {
      if(nums[i]==1)
      {
        x++;
        if(max<x)  max=x;
      }
      else {
        if(max<x)  max=x;
        x=0;
      }
    }

    return max;

  }
  public static void main(String[] args) {
    int arr[]={1};

    System.out.println(  findMaxConsecutiveOnes(arr));
  }
}

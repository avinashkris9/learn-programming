package com.github.avinashkris9.learn.programming.hackerrank.arrays;
/*https://leetcode.com/explore/featured/card/fun-with-arrays/511/in-place-operations/3258/

 */
public class InPlaceRemoveDuplicates {

  static int removeDuplicates(int[] arr)
  {
    int uniques=0;
    for(int i=1;i<arr.length;i++)
    {
     if(arr[i]!=arr[uniques])
     {
       arr[++uniques]=arr[i];

     }

    }
    return uniques+1;
  }
  public static void main(String[] args) {

    int[] arr={1,1,2};
    //{0,0,1,1,1,2,2,3,3,4};
   int x=removeDuplicates(arr);

   for(int i=0;i<x;i++)
   {
      System.out.print(arr[i]+" ");

   }
  }
}

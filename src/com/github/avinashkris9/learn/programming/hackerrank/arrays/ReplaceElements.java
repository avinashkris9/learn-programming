package com.github.avinashkris9.learn.programming.hackerrank.arrays;
/*
https://leetcode.com/explore/featured/card/fun-with-arrays/511/in-place-operations/3259/

 */
public class ReplaceElements {

  static void printArray(int[] arr)
  {
    for (int i : arr) {
      System.out.print(i +" ");
    }
    System.out.println();
  }
   static int[] replaceElements(int[] arr) {

    for(int i=0;i<arr.length-1;i++)
    {
      int big=arr[i+1];
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[j]>big) big=arr[j];
      }
      arr[i]=big;
    }
    arr[arr.length-1]=-1;
    return arr;
  }
  static int[] replaceElementsSolution(int[] arr)
  {
    int max=-1;
    for(int i=arr.length-1;i>=0;i--)
    {
      if(arr[i]>max) //means this is big element.
      {
        int temp=arr[i];
        arr[i]=max;
        max=temp;
      }
      else
      {
        arr[i]=max;
      }
    }
    return arr;
  }

  public static void main(String[] args) {

    int[] arr={57010,40840,69871,14425,70605};
    //replaceElements(arr);
    replaceElementsSolution(arr);
    printArray(arr);

  }
}

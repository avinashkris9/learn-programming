package com.github.avinashkris9.learn.programming.hackerrank.arrays;

public class InsertOnBeginning {
  static void printArray(int[] arr)
  {
    for (int i : arr) {
      System.out.print(i +" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {




    int[] arr = {-7, -3, 2, 3, 11};
    int[] newArr=new int[arr.length+1];
    //create to beginning by new array.
    newArr[0]=10000;
    for(int i=1;i<newArr.length;i++)
    {
      newArr[i]=arr[i-1];


    }
    printArray(newArr);



  }
}

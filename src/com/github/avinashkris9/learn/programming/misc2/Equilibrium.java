package com.github.avinashkris9.learn.programming.misc2;

import java.util.Scanner;

public class Equilibrium {

public static int equi(int[] x)
{

  int mid = x.length / 2;

  while (mid != x.length && mid != 0) {
    int sumA = 0, sumB = 0;
    for (int i = 0; i < mid; i++) {
      sumA += x[i];

    }
    for (int i = mid + 1; i < x.length; i++) {
      sumB += x[i];
      if(mid==1 &&sumB==0)
      {
        return 0;
      }

    }

    if (sumA == sumB) {

      return mid;
    } else if (sumA < sumB) {
      mid++;
    } else {
      mid--;
    }
  }
  return -1;
}
  public static int equi(int[] arr, int sum,int arrayLength)
  {


    int leftSum=0;
    for(int i=1;i<arrayLength;i++)
    {
       leftSum=leftSum+arr[i-1];
      int rightSum=sum-arr[i]-leftSum;
      if(leftSum==rightSum) return i;

    }
    return -1;

  }
  public static void main (String[] args) throws java.lang.Exception
  {

    Scanner s = new Scanner(System.in);
    String inputString = s.nextLine();
    String[] inputStringArray=inputString.split(",");
    int[] integers=new int[inputStringArray.length];
    int sum=0;
    for(int i=0;i<inputStringArray.length;i++)
    {
      integers[i]=Integer.parseInt(inputStringArray[i].trim());
      sum=sum+integers[i];
    }

    int x=equi(integers,sum,integers.length);

    System.out.println(integers[x]);
     x=equi(integers);
    System.out.println(integers[x]);
  }
}
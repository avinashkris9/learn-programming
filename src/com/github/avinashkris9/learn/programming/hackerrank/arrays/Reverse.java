package com.github.avinashkris9.learn.programming.hackerrank.arrays;

import java.util.Arrays;

public class Reverse {

  public static void main(String[] args) {

    int[] x={1,2,3,4,5};

    int p=2;

    int n =x.length;
    System.out.println( "Length ="+n);
    for(int i=0;i<=p;i++)
    {
        int temp=x[i];
        x[i]=x[n-i-1];
        x[n-i-1]=temp;
    }
    for(int i=0;i<x.length;i++)
    {
      System.out.print(x[i] + " ");
    }
  }
}

package com.github.avinashkris9.learn.programming.hackerrank.arrays;

import java.util.Arrays;

public class Reverse {

  public static void main(String[] args) {

    int[] x={1,2,3,4,5};

    int p=1;

    /**
     * 1,2,3,4,5
     * temp=1 a[0]=a[4]=5;
     * a[4]=5
     * 5,2,3,4,1
     * temp=2
     * a[0]=a[4]=4;
     * a[4] =5;
     *
     */
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

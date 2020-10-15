package com.github.avinashkris9.learn.programming.hackerrank.algorithms;

/**
 * https://www.hackerrank.com/challenges/circular-array-rotation/forum
 */
public class CircularArrayRotation {

/** naive way */
  static int[] circularArrayRotation1(int[] a, int k, int[] queries) {


    while(k>0)
    {
      int saver=-1;
      for(int i=0;i<a.length;i++)
      {


        if(i==0) saver=a[a.length-1];
        int temp=a[i];
        a[i]=saver;
        saver=temp;

      }
      k--;
    }
    int[] output=new int[queries.length];
    for(int i=0;i<queries.length;i++)
    {
      output[i]=a[queries[i]];
    }
    return output;
  }

  static int[] circularArrayRotation(int [] a,int k ,int[] queries)
  {
    /**
     * 1,4,5,6,2,9  position of element shift by one on each rotation. so instead of iterating over all elements, just need to find position
     * rot=1 -->  a[2]=a[2-rot]
     *
     */

    int[] output=new int[queries.length];
    for(int i=0;i<queries.length;i++)
    {
      if(queries[i]-k>=0)
      {
        output[i]=a[queries[i]-k];
      }
      else output[i]=a[queries[i]-k+a.length];
    }
    return output;
  }
  public static void main(String[] args) {

    int[] x={3,4,5};

    int saver=-1;


    for(int i=0;i<x.length;i++)
    {


      if(i==0) saver=x[x.length-1];
      int temp=x[i];
      x[i]=saver;
      saver=temp;

    }


  }
}

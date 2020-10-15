package com.github.avinashkris9.learn.programming.misc;

public class FibonacciSeries {

  private int[]lookupTable;
  static int recursion(int n)
  {

    if(n<2) {

      return n;
    }
    return recursion(n-1)+recursion(n-2);
  }

  FibonacciSeries(int n)
  {
    lookupTable=new int[n+10];
    for(int i=0;i<n+10;i++)
    {
      lookupTable[i]=-1;
    }
  }
  static int dynamicProgression(int n)
  {
    if(n<=2) return 1;
    int[] memory=new int[n];
    memory[0]=1;
    memory[1]=1;
    for(int i=2;i<n;i++)
    {
      memory[i]=memory[i-1]+memory[i-2];
    }
    return memory[n-1];
  }

  /**
   *
   * Do recursion to populate one.
   */
   int  memoization(int n)
  {

    if(lookupTable[n]==-1)
    {
      if(n<=1)
        lookupTable[n]=n;
      else
        lookupTable[n]=memoization(n-1)+memoization(n-2);
    }
    return lookupTable[n];
  }
  public static void main(String[] args) {


    int n=9;

    System.out.println(recursion(n));
    System.out.println(dynamicProgression(n));
    FibonacciSeries fb=new FibonacciSeries(n);
    System.out.println(fb.memoization(n));
  }
}

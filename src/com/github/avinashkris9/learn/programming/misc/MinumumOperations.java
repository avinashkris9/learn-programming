package com.github.avinashkris9.learn.programming.misc;

/*
 Find the minimum operations need to reach from 0 to n when only below operations are allowed
 1. add by 1
 2.  multiple by 2. ( double)
 */
public class MinumumOperations {

  public static void main(String[] args) {
    //

    int n=6;
    int counter=0;

    while(n!=0)
    {
      System.out.println("Number= "+n+ " Counter = "+counter);
      if(n%2==0)
      {
        n=n/2;
      }
      else
      {
        n=n-1;
      }
      counter=counter+1;
    }

    System.out.println(counter-1); //cause count is added one extra time for w
  }
}

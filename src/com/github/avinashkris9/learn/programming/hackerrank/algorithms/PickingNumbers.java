package com.github.avinashkris9.learn.programming.hackerrank.algorithms;

import java.util.Arrays;
import java.util.List;

public class PickingNumbers {

  public static int pickingNumbers(List<Integer> a) {


    int[] frequency=new int[101] ; //question says  0<a[i]<100 means number can only be upto 100;

    for(int i=0;i<a.size();i++)
    {
      int value=a.get(i);
      frequency[value]=frequency[value]+1;  // this counts the number of occurrence of each number;

    }

    int max=0;
    for(int i=1;i<=100;i++)
    {
      max=Math.max(max,frequency[i]+frequency[i-1]);
    }
    return max;
  }

  public static void main(String[] args) {

    List<Integer> list= Arrays.asList(4 ,6, 5, 3, 3, 1);
    System.out.println(pickingNumbers(list));
  }
}

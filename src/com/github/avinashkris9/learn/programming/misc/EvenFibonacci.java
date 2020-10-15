package com.github.avinashkris9.learn.programming.misc;

public class EvenFibonacci {

  public static void main(String[] args) {
    // TODO Auto-generated method stub


    int a = 0;
    int b = 1;
    int s = 0;
    int sum = 0;
    while (s < 4000000) {
      s = a + b;
      b = a;
      a = s;
      if (s % 2 == 0) {
        sum = sum + s;
      }
    }
    System.out.println("Sum==" + sum);
  }
}

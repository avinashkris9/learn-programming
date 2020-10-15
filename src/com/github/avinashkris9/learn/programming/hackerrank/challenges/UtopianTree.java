package com.github.avinashkris9.learn.programming.hackerrank.challenges;

/**
 * https://www.hackerrank.com/challenges/utopian-tree/problem
 */
public class UtopianTree {
  // Complete the utopianTree function below.

  /**
   * if number is odd -> spring -> double the height
   * if number is even --> summer-> grow 1m;
   * @param n
   * @return
   */
  static int utopianTree(int n) {

    int h=1;
    for(int i=1;i<=n;i++)
    {
      if(i%2==0) h=h+1;
      else
        h=h*2;
    }
    return h;
  }

  public static void main(String[] args) {

    utopianTree(5);
  }
}

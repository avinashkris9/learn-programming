package com.github.avinashkris9.learn.programming.hackerrank.algorithms;

import java.util.Scanner;

public class DrawingBook {


  static int pageCount(int n, int p) {
    /*
     * Idea is to find the position of number from both sides .
     */


  int frontCount =p/2; // p-> page to be read

    int backCount= (n-p )/2;

    System.out.println(frontCount + " " +backCount);
    if(frontCount<backCount) return frontCount;else return  backCount;

  }


  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

      pageCount(5,4);

  }
}

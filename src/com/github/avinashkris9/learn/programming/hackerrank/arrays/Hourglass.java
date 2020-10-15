package com.github.avinashkris9.learn.programming.hackerrank.arrays;

public class Hourglass {

  public static void main(String[] args) {

    int[][] array = {
      {1, 1, 1, 0, 0, 0},
      {0, 1, 0, 0, 0, 0},
      {1, 1, 1, 0, 0, 0},
      {0, 0, 2, 4, 4, 0},
      {0, 0, 0, 2, 0, 0},
      {0, 0, 1, 2, 4, 0}
    };

    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6-2;j++) {

        System.out.print(array[i][j] + " " +array[i][j+1] + " "+array[i][j+2]);
      }
      System.out.println();
    }
    }
}

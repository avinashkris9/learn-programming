package com.github.avinashkris9.learn.programming.hackerrank.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/*

https://www.hackerrank.com/challenges/migratory-birds/problem
 */
public class MigratoryBirds {


  // in the question it is given that possible numbers are 1<birds<5
  // so idea is to find the count for each of this possible numbers by looping the List.
  // then find the number which got maximum value out of this sorted 1<birds<5.
  static int migratoryBirds(List<Integer> arr) {

    int min = 0;
    int occurrence = 0;

    int[] possible = new int[5];

    for (Integer number : arr) {
      // possible array starts from zero. to adjust index do --
      possible[number - 1]++;
    }

    //       System.out.println(Arrays.toString(possible));

    int maxAt = 0;
    for (int i = 1; i < possible.length; i++) {

      if (possible[i] > possible[maxAt]) {
        maxAt = i;
      }
    }

    // since array index starts at zero add 1 to get actual bird Id !
    return maxAt + 1;
  }

  public static void main(String[] args) {

    List<Integer> arr = Arrays.asList(1, 4, 4, 4, 5, 3);

    migratoryBirds(arr);
  }
}

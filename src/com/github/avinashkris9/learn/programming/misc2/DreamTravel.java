package com.github.avinashkris9.learn.programming.misc2;
import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.util.Arrays;

//REFERENCE ONLY>

class DreamTravel {

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    while (t-- > 0) {

      int n = Integer.parseInt(br.readLine());

      Integer[] arr = Arrays.stream(br.readLine().split(" ")).map(x -> Integer.parseInt(x.trim())).toArray(Integer[]::new);

      System.out.println(minCost(arr, n));

    }

  }



  private static int minCost(Integer[] arr, int n) {

    if (n == 0) {

      return 0;

    }

    int minCost = 0;

    Arrays.sort(arr);

    while (n >= 4) {

      // take first and second element --> bring back first element --> take the last two elements
      // --> bring back second element
      // here total cost = second element + first element coming back + last element + second
      //      // element coming back
      int option1 = arr[1]+arr[0]+arr[1]+arr[n-1];

      // take first and last element --> bring back first element --> take first and second-to-last
      // element --> bring back the first element
      // here total cost = last element + first element coming back + second-to-last element + first
      // element coming back
      int option2 =arr[n-1]+arr[0]+arr[n-2]+arr[0];

          minCost +=Math.min(option1,option2);


      n -= 2;



    }

    if (n == 1) {

      minCost += arr[0];

    }

    if (n == 2) {

      minCost += arr[1];

    }

    if (n == 3) {

      minCost += arr[0] + arr[1] + arr[2];

    }

    return minCost;

  }

}


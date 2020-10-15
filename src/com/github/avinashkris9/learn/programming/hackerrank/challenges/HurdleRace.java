package com.github.avinashkris9.learn.programming.hackerrank.challenges;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/the-hurdle-race/problem
 */
public class HurdleRace {


  static int hurdleRace(int k, int[] height) {

    int dose=0;
    int max=0;
    for(int i=0;i<height.length;i++)
    {


      if(height[i]>k && height[i]>max)
      {
     //  System.out.println(" DOse required while jumping "+ height[i]+ " max = "+max+ "Dose"+ dose);
        if(dose==0) dose=height[i]-k;
        else dose=dose+ (height[i]-max);


        max=height[i];

      }
    }
    return dose;

  }

  static int hurdleRaceNew(int k ,int[] height)
  {
//filter heights over the natural jump, find the max
    return
        Arrays.stream(height).filter(h ->  h>k).map(maxHeight -> maxHeight -k).max().orElse(0);
  }
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {

    String[] nk = scanner.nextLine().split(" ");

    int n = Integer.parseInt(nk[0]);

    int k = Integer.parseInt(nk[1]);

    int[] height = new int[n];

    String[] heightItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
      int heightItem = Integer.parseInt(heightItems[i]);
      height[i] = heightItem;
    }

    System.out.println("Let's");
    int result = hurdleRace(k, height);
    System.out.println(result);

    scanner.close();

  }
}

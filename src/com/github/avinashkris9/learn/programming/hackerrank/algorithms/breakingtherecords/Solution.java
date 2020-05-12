package com.github.avinashkris9.learn.programming.hackerrank.algorithms.breakingtherecords;

import java.util.Scanner;

/*

https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 */
public class Solution {


    /*
    our job is to find out how many swappings occurred for minimum value and max value;
     */

    public static int[] findMinAndMax( int[] scores)
    {
        int min=scores[0];
        int max=scores[0];
        int minCount=0;
        int maxCount=0;
        int[] minMax =new int[2];
        for(int i=1;i<scores.length;i++)
        {
            if(scores[i]<min)
            {
                min=scores[i];
                minCount++;
            }
            else if(scores[i]>max)
            {
                max=scores[i];
                maxCount++;
            }
        }
       minMax[0]=maxCount;
        minMax[1]=minCount;
        return minMax;

    }
    public static void main(String[] args) {



        int scores[]={3 ,4 ,21, 36, 10 ,28, 35, 5, 24 ,42};
        findMinAndMax(scores);


    }
}

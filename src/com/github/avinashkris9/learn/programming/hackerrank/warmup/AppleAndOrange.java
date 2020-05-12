package com.github.avinashkris9.learn.programming.hackerrank.warmup;

import java.util.Arrays;
//https://www.hackerrank.com/challenges/apple-and-orange/forum
public class AppleAndOrange {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int appleCount=0;
        int orangeCount=0;

        appleCount= (int)Arrays.stream(apples).filter(x -> x+a >=s && x+a <=t).count();
        orangeCount= (int)Arrays.stream(oranges).filter(x -> x+a >=s && x+a <=t).count();
//        for(int i=0;i<apples.length;i++)
//        {
//            int x=apples[i]+a;
//            if(x>=s && x<=t)
//            {
//                appleCount++;
//            }
//        }
//        for(int i=0;i<oranges.length;i++)
//        {
//            int x=oranges[i]+b;
//            if(x>=s && x<=t)
//            {
//                orangeCount++;
//            }
//        }

        System.out.println(appleCount);
        System.out.println(orangeCount);
    }


    public static void main(String[] args) {


        int s=7;
        int t=11;
        int a=5;
        int b=15;
        int[] apples ={-2,2,1};
        int[] oranges={5,-6};
        countApplesAndOranges(s,t,a,b,apples,oranges);
    }
}

package com.github.avinashkris9.learn.programming.hackerrank.algorithms.betweentwotests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
https://www.hackerrank.com/challenges/between-two-sets/problem
 */
public class BetweenTwoTests {


    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here

        //Using lables to denote the loops
        int divisibleNumbers=0;
        outer: for(int i =1;i<=100;i++)
        {

             for( Integer x: a)
             {
                 if(i%x !=0)
                 {


                     continue outer;
                 }
             }
             for(Integer y:b)
             {
                 if(y%i !=0)
                 {
                     continue  outer;
                 }

             }
            System.out.println(i);
             divisibleNumbers++;


        }
        return  divisibleNumbers;
    }

    public static void main(String[] args) {

        List <Integer>a= Arrays.asList(2,4 );
        List <Integer> b=Arrays.asList(16,32,96);
        getTotalX(a,b);
    }
}

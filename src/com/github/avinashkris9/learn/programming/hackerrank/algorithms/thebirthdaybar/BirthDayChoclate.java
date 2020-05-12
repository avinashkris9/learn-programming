package com.github.avinashkris9.learn.programming.hackerrank.algorithms.thebirthdaybar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

https://www.hackerrank.com/challenges/the-birthday-bar/problem
 */
public class BirthDayChoclate {

    /*

    The idea is to find out the
    day -> sum of array element.
    month -> consecutive array elements that can be considered
     */

    public   static int birthday(List<Integer> s, int d, int m) {


            int count=0;

            for(int i=0;i<=s.size()-m;i++)
            {

                int sum=0;
                for(int j=0;j<m;j++)
                {
                       sum =sum+s.get(i+j);

                }
                   if(sum ==d)
                   {


                       count++;
                   }

            }
            return count;
    }
        public static void main(String[] args) {


        List<Integer>test=Arrays.asList(1,2,1,0,2,1);
            System.out.println( birthday(test,3,3));

        }
}

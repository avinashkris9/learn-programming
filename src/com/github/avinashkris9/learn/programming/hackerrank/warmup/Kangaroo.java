package com.github.avinashkris9.learn.programming.hackerrank.warmup;

public class Kangaroo {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {

        // maths
        /*
        if they meet they meet at .
        x1-v1*n =x2-v2*n
        n=x2-x1/(v1-v2)
         */

        if((x1<x2) && (v1<v2))
           return  "NO";
        else
        {
            if((v1!=v2) && ((x2-x1)%(v1-v2))==0)
              return "YES";
            else
               return  "NO";

        }

    }

    public static void main(String[] args) {

        System.out.println(kangaroo(0,2,5,3));

    }
}

package com.github.avinashkris9.learn.programming.hackerrank.algorithms.dividesumpairs;

/**
 * https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
 */
public class DivideSumPairs {


    /*
    Loop over array elements and add them.
    Since we only have 100 values  ( constraints in problem) we can do
    O(n2)

     */
    static int divisibleSumPairs(int n, int k, int[] ar) {





        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j =i+1;j<n;j++)
            {
                if( (ar[i]+ ar[j]) %k ==0)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {


        int k =3;
        int [] numbers={1,3,2,6,1,2};
        System.out.println(divisibleSumPairs(numbers.length,k,numbers));
    }
}

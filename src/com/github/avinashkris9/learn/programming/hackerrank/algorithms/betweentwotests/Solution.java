package com.github.avinashkris9.learn.programming.hackerrank.algorithms.betweentwotests;

import java.util.ArrayList;
import java.util.List;

/*
INCOMPLETE
Solution after looking into discussions :)
O(n log(n)) solution.
1. find the LCM of all the integers of array A.
2. find the GCD of all the integers of array B.
3. Count the number of multiples of LCM that evenly divides the GCD.
 */
public class Solution {


   // hcf
    public static int hcf( int a  ,int b)
    {
        if(a==0) return b;
        return (hcf(b%a,a));
    }

    /*
    find gcd of 2 numbers,
    find gcd of next number and gcd found above.
     */
    public static int hcfOfArray( int[] numbers)
    {
        int currentHcf=numbers[0];
        for(int i=1;i<numbers.length;i++)
        {
            currentHcf=hcf(currentHcf,numbers[i]);

        }
        return currentHcf;
    }

    public static int  findLcm(int a,int b)
    {

        return a*b/ (hcf(a,b));
    }

    public  static int lcmOfArray(int[] numbers)
    {
       return 0;

    }

    public static  int findFactors(int lcm, int hcf)
    {

        List<Integer> numbers=new ArrayList<>();


        for(int i=0;i<100;i++)
        {
            int divisor=lcm*i;
            if(hcf/divisor==0)
            {
                numbers.add(divisor);
            }

        }
        return 0;

    }
    public static void main(String[] args) {

        int[] numbers={2, 4};
        int [] factors ={16,32,96};
        int lcm= lcmOfArray(numbers);
        int hcf =hcfOfArray(factors);

    }
}

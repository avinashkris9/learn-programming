package com.github.avinashkris9.learn.programming.algorithms.maths;
/*

Find GCD.HCF of an array of numbers using Euclids theorem
 */
public class GCDofArray {


    public static int gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return (gcd(b%a,a));
    }
    public static void main(String[] args) {

// find hcf of 2 numbers,
        // find hcf of above hcf and the next number.
        int[] numbers={ 3, 18, 9, 9, 5,
                15, 8, 7, 6, 9 };
        int hcf=numbers[0];
        for(int i=1;i<numbers.length-1;i++)
        {
            int a=hcf;
            int b =numbers[i];


            if(a>b)
            {
                hcf=gcd(a,b);
            }
            else
                hcf = gcd(b, a);
            System.out.println("GCD of "+a+ " "+b + " is "+hcf);

        }
        System.out.println(hcf);
    }
}

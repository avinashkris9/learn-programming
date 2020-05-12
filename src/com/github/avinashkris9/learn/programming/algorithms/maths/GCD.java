package com.github.avinashkris9.learn.programming.algorithms.maths;
/*
GCD of two numbers is the largest number that divides both of them.

36 =2*2*3*3
60 =2*2*2*5
so gcd =2*2*3
If we subtract smaller number from larger (we reduce larger number), GCD doesn’t change. So if we keep subtracting repeatedly the larger of two, we end up with GCD.
Now instead of subtraction, if we divide smaller number, the algorithm stops when we find remainder 0.
 */
public class GCD {


    //logic is divide larger number with smaller number.
    // repeat this
    // until reminder is zero until divisor become zero,
    // that gives GCD. Refer to Euclids theorem
    // .
    public  static int gcd(int a,int b)
    {
        if(a==0)
        {
            return  b;
        }
        return (gcd(b%a, a));
    }
    public static void main(String[] args) {


        int x=31;
        int y=2;
        if(x>y)
        {
            System.out.println( gcd(x,y));
        }
        else
            System.out.println( gcd(y,x));
    }
}

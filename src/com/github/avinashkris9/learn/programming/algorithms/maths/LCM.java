package com.github.avinashkris9.learn.programming.algorithms.maths;

/*
LCM -Least Common Multiple
Equations
LCM(a,b)=a*b /HCF(a,b)
LCM* HCF =a*b
Example
For eg LCM(2,7) => 2*7 / HCF(2,7)
HCF(2,7) 7%2 =HCF(1,2) =1
so LCM(2,7) =14
To find hcf, we  can either use recursion. use inbuilt gcd method for big integer, or keep dividing till we find
reminder =0;
 */
public class LCM {

  public static int hcf(int a, int b) {
    while (a > 0) {
      int r = b % a;

      b = a;
      a = r;
    }
    return b;
  }

  public static int lcm(int a, int b) {

    return a * b / hcf(a, b);
  }

  public static void main(String[] args) {

    System.out.println(lcm(9, 30));
  }
}

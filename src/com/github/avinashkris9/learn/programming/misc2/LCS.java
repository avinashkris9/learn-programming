package com.github.avinashkris9.learn.programming.misc2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Longest Common Subsequence
 * Given two strings, find the longest common subsequence can be formed
 */
public class LCS {

  public static void main(String[] args) {

    String str1="ABECBA";
    String str2="BCDBCDA";
    System.out.println(recursion(str1,str2,0,0));

    int[][] dp=new int[str1.length()+1][str2.length()+1];
    for(int[] row :dp)
    {
      Arrays.fill(row,-1);
    }

    memoization(str1,str2,0,0,dp);
    System.out.println(dp[0][0]);
    dp(str1,str2);
  }

  public static int recursion(String str1,String str2,int a,int b)

  {


    //if in case we reached end of string.
    if(a>=str1.length()|| b>=str2.length()) return 0;

    if(str1.charAt(a)==str2.charAt(b))
    {
      // the characters matched, so now increment count and try with next character

      return 1+recursion(str1,str2,a+1,b+1);

    }
    //two possibiltiy is there .
    // start with next alphabet of str2 and search str1 from the current position.
    // or increment the size of str1 keeping str same  start searching from there.
    return Math.max(recursion(str1,str2,a+1,b) ,recursion(str1,str2,a,b+1));
  }

  public static int memoization(String str1,String str2,int a ,int b ,int[][] dp)
  {


    //if in case we reached end of string.
    if(a>=str1.length()|| b>=str2.length()){ dp[a][b]=0 ;return 0;}

    //only change is here. if we already know answer at a,b --> return it rather than recalculation.
    if(dp[a][b]!=-1) return dp[a][b];
    if(str1.charAt(a)==str2.charAt(b))
    {
      // the characters matched, so now increment count and try with next character
      dp[a][b] = 1+memoization(str1,str2,a+1,b+1,dp);;
      return dp[a][b];

    }
    //two possibiltiy is there .
    // start with next alphabet of str2 and search str1 from the current position.
    // or increment the size of str1 keeping str same  start searching from there.


    dp[a][b]=Math.max( memoization(str1,str2,a+1,b,dp),   memoization(str1,str2,a,b+1,dp));;;
    return dp[a][b];

  }


  public  static void dp(String str2,String str1)
  {
    int[][] dp=new int[str1.length()+1][str2.length()+1];

    //initialise with zero;
//    for(int i=0;i<=str2.length();i++)
//    {
//      dp[0][i] = 0;
//    }
//    for(int i=0;i<=str1.length();i++)
//    {
//      dp[i][0] = 0;
//    }





    for(int i=0;i<=str1.length();i++)
    {

      for (int j = 0; j <= str2.length(); j++) {

        if (i == 0 || j == 0) {
          dp[i][j] = 0;
        } else {
          if (str1.charAt(i - 1) == str2.charAt(j - 1)) {

            dp[i][j] = 1 + dp[i - 1][j - 1];
          } else {
            dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
          }
         } }
    }
//
//    for(int i=0;i<=str1.length();i++)
//    {
//      for(int j=0;j<=str2.length();j++)
//      {
//        System.out.print(dp[i][j] + " ");
//      }
//      System.out.println();
//    }


    System.out.println(dp[str1.length()][str2.length()]);

  }
}

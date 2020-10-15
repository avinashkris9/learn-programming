package com.github.avinashkris9.learn.programming.misc2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import javax.sound.midi.SysexMessage;

public class Abbrevation {




  public static void main (String[] args) throws java.lang.Exception

  {

    //    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //
    //    int t = Integer.parseInt(br.readLine());
    //
    //    while (t-- > 0) {
    //
    //      String a = br.readLine();
    //
    //      String b = br.readLine();
    //
    //
    //      }

    String s1="beFgH";
    String s2="EFH";


//    String s1="daBcD";
//    String s2="ABC";
    boolean[][] dp=new boolean[s1.length()+1][s2.length()+1];
    for(int i=0;i<dp[0].length+1;i++)
    {
      dp[0][i]=false;

    }
    for(int i=0;i<dp.length;i++)
    {
      dp[i][0]=false;
    }



    System.out.println("Finally --" +recursion(s1,s2));

    //int x=abbrevation(s1.toCharArray(),s2.toCharArray(),0,0,dp);
    //if (x > 0) System.out.println("YES") ;else System.out.println("NO");;
  }

  static boolean recursion(String a,String b)
  {
  //  System.out.println(a+ " --> "+b);


    if(a.length()<0|| a.length()<b.length()) return false;
    if(b.length()==0)
    {

      for(int i=0;i<a.length();i++)
      {
        if((int)a.charAt(i)<97)
        {

          return false;
        }

      }

      return true;
    }

    char s1=a.charAt(0);
    a=a.substring(1);

    if(Character.isLowerCase(s1)) //if it starts with a lowercase, recurse and divde again
    {
  //    System.out.println("Lower Case Recursive Calls "+a+ " --> "+ b);
      return recursion(a,b) || recursion(Character.toUpperCase(s1)+a,b);

    }



 //   System.out.println(s1+ " --> "+a+" --> "+b);
    if(Character.toUpperCase(s1) !=(b.charAt(0))){ return false;}

    //match found. delete from B as well.

    b=b.substring(1);

  //  System.out.println("Recursive Calls on b "+a+ " --> "+ b);
    return (recursion(a,b));




  }





}
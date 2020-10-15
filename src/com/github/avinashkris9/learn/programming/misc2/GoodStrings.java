package com.github.avinashkris9.learn.programming.misc2;

import java.util.HashMap;
import java.util.Map;

/**
 * Remove consecutive duplicates from string
 */
public class GoodStrings {

  public static void main(String[] args) {

    String str1="abb";
      StringBuilder str2=new StringBuilder();


    str2.append(str1.charAt(0));
    for(int i=1;i<str1.length();i++)
    {

      if(str1.charAt(i)!=str1.charAt(i-1))
      {
        str2.append(str1.charAt(i));
      }

    }
    System.out.println(str2);
  }
}


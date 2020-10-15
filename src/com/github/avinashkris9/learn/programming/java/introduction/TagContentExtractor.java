package com.github.avinashkris9.learn.programming.java.introduction;
import java.util.regex.*;
import java.util.*;
/*
https://www.hackerrank.com/challenges/tag-content-extractor/problem?h_r=next-challenge&h_v=zen
 */
public class TagContentExtractor {
  public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());
    ArrayList array=new ArrayList();
    while(testCases>0){
      String line = in.nextLine();

      // Write your code here

      Matcher m = Pattern.compile("<(.+)>([^<]+)<\\/\\1>").matcher(line);

      while(m.find())
      {

        System.out.println(m.group(2));
      }
      testCases--;
    }
  }
}

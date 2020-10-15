package com.github.avinashkris9.learn.programming.hackerrank.challenges;

import java.util.Arrays;

/*

https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
 */
public class DesignPdfViewer {

  // Complete the designerPdfViewer function below.
  static int designerPdfViewer(int[] h, String word) {

    word=word.toLowerCase();
    int max=0;
    for(int i=0;i<word.length();i++)
    {
      int position=word.charAt(i)-97;
      if(h[position]>max)
        max=h[position];

    }
    return max*word.length();


  }
  public static void main(String[] args) {


  }
}

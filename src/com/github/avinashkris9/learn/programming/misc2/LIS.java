package com.github.avinashkris9.learn.programming.misc2;

/**
 * Longest Increasing SubSequence.
 *
 * for each element, check if there is an subsequence which can incldue this number.
 *
 */
public class LIS {

  public static void main(String[] args) {

    int[] arr={3, 10, 2, 1, 20};
    System.out.println(dp(arr));
  }

 static int dp(int[] arr )
 {
   int[] result =new int[arr.length];
    if(arr.length==1)return 1;
   for(int i=0;i<arr.length;i++)
   {
     result[i]=1;
     for(int j=0;j<=i-1;j++)
     {

       if(arr[j]<arr[i] && result[i]<1+result[j])
       {

         result[i]=1+result[j];
       }
     }
          //  System.out.println(arr[i]+ " --> "+ result[i]);

   }

   int max=0;
   for (int j=0;j<result.length;j++) {

     if (result[j] > max) {
       max = result[j];
     }
   }
   return max;
 }
}

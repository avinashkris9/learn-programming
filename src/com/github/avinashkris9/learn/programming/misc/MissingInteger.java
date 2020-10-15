package com.github.avinashkris9.learn.programming.misc;

import java.util.HashMap;
import java.util.Map;

/*

Find the smallest positive number missing from an unsorted array . Array can contain negatives and positiives
 */
public class MissingInteger {

  /*
   Idea 1 --> Sort array. Iterate and compare adjecent elements
   Idea 2 --> convert array to a map. If any element is missing on array. that's ur number.

   */

 static int findMissingSmallestInteger( int[] arr, int size)
 {
   Map<Integer,Integer> numberMap=new HashMap<>();
   for(int i=0;i<size;i++)
   {

     if(arr[i]>=0)
     {
       if(numberMap.containsKey(arr[i]))
       {
         numberMap.put(arr[i],numberMap.get(arr[i])+1);
       }
       else
       {
         numberMap.put(arr[i],1);
       }

     }
   }
   int l=1;
   while(true){
     if(!numberMap.containsKey(l))
     {
       return l;
     }
     l++;
   }


 }
  public static void main(String args[])
  {

    int[] arr={-5, 2, 0, -1, -10, 15 };
    int xx=findMissingSmallestInteger(arr,arr.length);
    System.out.println(xx);
  }
}

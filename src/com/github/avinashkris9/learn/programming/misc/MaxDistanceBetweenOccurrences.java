package com.github.avinashkris9.learn.programming.misc;

import java.util.HashMap;
import java.util.Map;

/**
 * For given array find the maximum distance betweeen the multiple occurrence of same element
 * {3,2,1,2,1,4,5,8,6,7,4,2}
 * a[1] ->a[11]=>10
 */
public class MaxDistanceBetweenOccurrences {

  public static void main(String[] args) {


    int[] arr={3,2,1,2,1,4,5,8,6,7,4,2};

    Map<Integer,Integer> hasStore=new HashMap<Integer,Integer>();
    int max=0;
    for(int i=0;i<arr.length;i++)
    {
      if(hasStore.containsKey(arr[i]))
      {
        int distance=i-hasStore.get(arr[i]);// distnace from initial point to new occurrence;
        if(max<distance)
        {
          max=distance;
        }
      }
      else
      {
        hasStore.put(arr[i],i); //firsttime i am seeing this number,addidng to the hashMap.
      }

    }

    System.out.println("Maximum distance "+max);
  }
}

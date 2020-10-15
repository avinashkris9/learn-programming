package com.github.avinashkris9.learn.programming.misc;

/**
 *
 * Given a number, find  the ceil value and floor value of the number from a given sorted array
 */
public class CeilAndFloor {


 static int  findCeilAndFloor( int[] arr,int size,int searchNumber)
  {
    int x=0;
    int start=0,end=size,mid=(start+size)/2;

    while(start<=end)
    {
      if(searchNumber<=arr[start])return start;

      if(searchNumber ==arr[mid])
      {
        return arr[mid];
      }

      if(searchNumber>arr[mid] )
      {
        if(mid+1<=end && searchNumber<arr[mid+1])return mid+1;
        start=mid+1;
      }
      else
      {
        if(mid-1>=start && searchNumber>arr[mid-1])return mid;
        end=mid-1;
      }
      mid = (start + end) / 2;


    }

    return -1;
  }

  public static void binarySearch(int[] arr, int numberToSearch) {

    int start = 0;
    int end = arr.length;
    int mid = end / 2;

    while (start <= end) {
      System.out.println("Search =" + numberToSearch + " Start =" + start + " Middle =" + mid + " end= " + end);
      if (arr[mid] == numberToSearch) {
        System.out.println(" Number " + numberToSearch + " found at position " + mid);
        return;
      }
      if (numberToSearch < arr[mid]) {

        end = mid - 1;
        mid = (start + end) / 2;
      }

      if (numberToSearch > arr[mid]) {
        start = mid + 1;
        mid = (start + end) / 2;
      }

    }
    System.out.println("Number " + numberToSearch + "  not found");

  }

  public static void main(String[] args) {
    //

    int[] arr={1,4,6,8,9};

    int x=findCeilAndFloor(arr,arr.length,3);
    if (x == 0 || x == arr.length) System.out.println(" Ceil= "+arr[x]);
    else System.out.println(" Ceil= "+arr[x]+" Floor= "+arr[x-1]);
  }
}

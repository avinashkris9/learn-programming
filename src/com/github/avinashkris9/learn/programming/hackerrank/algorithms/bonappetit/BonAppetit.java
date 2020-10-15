package com.github.avinashkris9.learn.programming.hackerrank.algorithms.bonappetit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BonAppetit {
  // Complete the bonAppetit function below.
  static void bonAppetit(List<Integer> bill, int k, int b) {

    int sum=0;


    // loop over the bill list
   for(int i=0;i<bill.size();i++)
   {
     if( i!=k)  // if the item is not eaten by Anna,
     {
       sum =sum+bill.get(i);  //add the item to sharing sum.
     }
   }
   if((sum/2 == b)) // if sharing sum is equal to Bill
    {
      System.out.println("Bon Appetit");
    }
    else // print the difference amount paid by anna
    {
      int temp=b-(sum/2);
      System.out.println(temp);
    }

  }

  public static void main(String[] args) {

    List<Integer> list= Arrays.asList(3, 10, 2, 9);
  // position of item in list that is not eaten by Anna
    int k =1;

    // anna`s share.
    int b=7;
    bonAppetit(list,k,b);
  }
}

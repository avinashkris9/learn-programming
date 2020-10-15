package com.github.avinashkris9.learn.programming.hackerrank.algorithms.bonappetit;

import java.util.Arrays;
import java.util.List;

public class BonAppetitJava8 {
  // Complete the bonAppetit function below.
  static void bonAppetit(List<Integer> bill, int k, int b) {


//find sum of all elements in list.

  int sum =bill.stream().reduce((x,y) -> x+y).get();

  // remove the item not eaten from this sum.
    sum = sum - bill.get(k);
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
    int b=12;
    bonAppetit(list,k,b);
  }
}

package com.github.avinashkris9.learn.programming.misc;

import java.net.URL;
import java.util.Collections;
import java.util.List;

public class WidgetOrders {



  public static int filledOrders(List<Integer> order, int k) {
    // Write your code here
    int remaining=k;
    int finishedOrder=0;

    Collections.sort(order);

    for(int i :order)
    {


      if(remaining==0)
      {
        break; //no use to check any futher;
      }

      if(i<=remaining)
      {
        finishedOrder++;
        remaining=remaining-i;
      }




    }
    return finishedOrder;
  }
}

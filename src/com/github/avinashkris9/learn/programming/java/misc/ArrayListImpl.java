package com.github.avinashkris9.learn.programming.java.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListImpl {
  public static void main(String[] args) {
    //

    List<Integer> list= new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

    for(int x:list)
    {

      if(x==2)
      {
        list.remove(list.remove(x));
      }
    }

    list.forEach(x -> System.out.println(x+","));
  }
}
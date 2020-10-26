package com.github.avinashkris9.learn.programming.hackerrank.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaListManipulation {

  public static void main(String[] args) {

    Scanner s=new Scanner(System.in);

    int lengthOfList=Integer.parseInt(s.nextLine());
    List<Integer> list=new ArrayList<>();
    for(int i=0;i<lengthOfList;i++)
    {
      list.add(s.nextInt());
    }



    int listOfOperations=s.nextInt();

    while (listOfOperations>0)
    {

      String operation=s.next();


      if(operation.equals("Insert"))
      {

       int position=s.nextInt();
        int values=s.nextInt();
        list.add(position,values);

      }

       if(operation.equals("Delete"))

      {
          list.remove(s.nextInt());
      }
    listOfOperations--;

    }

    System.out.println();
    list.forEach(x -> System.out.println(x));
  ;

  }
}

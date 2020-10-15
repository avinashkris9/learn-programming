package com.github.avinashkris9.learn.programming.java.introduction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateConversion {


  public static String findDay(int month, int day, int year) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DDMMYYY");

    LocalDate localDate=LocalDate.of(year,month,day);


    return localDate.getDayOfWeek().toString();
  }



  public static void main(String[] args) {

    System.out.println(findDay(9,2,2020));
  }
}

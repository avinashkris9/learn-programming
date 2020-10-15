package com.github.avinashkris9.learn.programming.misc2;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ConvertTime {

  public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
    String time=scanner.nextLine().trim();
    System.out.println(militaryTime(time));
  }

  static  String militaryTime(String time)
  {
    DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("hh:mm:ssa", Locale.ENGLISH);
    DateTimeFormatter dateTimeFormatter1=DateTimeFormatter.ofPattern("HH:mm:ss", Locale.ENGLISH);
    LocalTime localTime=LocalTime.parse(time,dateTimeFormatter);

    return localTime.format(dateTimeFormatter1).toString();
  }
}

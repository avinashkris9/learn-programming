package com.github.avinashkris9.learn.programming.hackerrank.warmup;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 */
public class DayOfProgrammer {
  // Complete the dayOfProgrammer function below.

  //dont think too much.
  static String dayOfProgrammer(int year) {


  if(year==1918)
    return "26.09.1918";
  else
  {
    if(isLeapYear(year))
      return "12.09."+year;
    return "13.09."+year;
  }
  }

  static boolean isLeapYear(int year)
  {
    if (year<1919)
    {
      if(year%4==0)
      {
        return true;
      }
      return false;
    }
    else
    {
      if((year %4==0 && year %100 !=0)||(year %400 ==0) )
      {
        return true;
      }
      return false;
    }
  }

  public static void main(String[] args) {
    //
    System.out.println(dayOfProgrammer(1812));
  }
}

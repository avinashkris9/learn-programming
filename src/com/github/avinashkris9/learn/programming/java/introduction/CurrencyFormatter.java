package com.github.avinashkris9.learn.programming.java.introduction;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

  public static void main(String[] args) throws ParseException {
    Scanner scanner = new Scanner(System.in);

    double payment = scanner.nextDouble();
    scanner.close();
 CurrencyFormatter currencyFormatter=new CurrencyFormatter();

  
    // Write your code here.
    String myString=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
Locale locale=new Locale("en","IN");
    System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
    System.out.println("India: " + NumberFormat.getCurrencyInstance(locale).format(payment));
    System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
    System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
  }
}

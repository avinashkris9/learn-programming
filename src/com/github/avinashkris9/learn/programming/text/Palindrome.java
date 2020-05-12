package com.github.avinashkris9.learn.programming.text;

import java.util.Scanner;

/**
 *
 Checks if the string entered by the user is a palindrome. That is that it reads the same forwards as backwards like “racecar”
 */
public class Palindrome {


    public  static String reverseString(String inputString)
    {
        int length=inputString.length()-1;
        String reverse="";
        while(length>=0)
        {
            reverse=reverse+inputString.charAt(length);
            length--;


        }
        return reverse;
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print(" Please input string: ");
        String input=scanner.next();
        String reverse=reverseString(input);
        if(input.equalsIgnoreCase(reverse))
        {
            System.out.println(input+" is a palindrome");
        }
        else
        {
            System.out.println(input + " is not  a palindrome. Reverse is "+reverse);
        }

    }
}

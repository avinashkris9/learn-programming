package com.github.avinashkris9.learn.programming.text;

import java.util.Scanner;

/**
 * Revere a string
 *
 */
//Enter a string and the program will reverse it and print it out.
public class ReverseString {


    public static void usingStringFunction(String inputString)
    {
        System.out.println("**** Using java string functions ****");


        //String is immuatable, so adding each char creates new string
        // so what if i use a string builder to build a single string object
        StringBuilder reverseString=new StringBuilder();
        int count=inputString.length()-1;
        while(count>=0)
        {

            reverseString.append(inputString.charAt(count));

            count --;


        }
        System.out.println(" Reverse of "+inputString+ " is "+reverseString);
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter the string to be reversed");
        String input=scanner.next();
        usingStringFunction(input);


    }
}

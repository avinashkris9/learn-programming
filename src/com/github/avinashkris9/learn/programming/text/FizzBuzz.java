package com.github.avinashkris9.learn.programming.text;


import java.util.Scanner;

/**
 * Fizz Buzz - Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead
 * of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five
 * print “FizzBuzz”.
 *
 */
public class FizzBuzz {



    public static void main(String[] args) {
        int upperLimit=100;
        int lowerLimit=1;


        for(int i=lowerLimit;i<=upperLimit;i++)
        {

            if(i%3 ==0 )
            {
                if(i%5==0)
                {
                    System.out.println("FizzBuzz");
                }
                else
                {
                    System.out.println("Fizz");
                }

            }
            else
            {
                if(i %5==0)
                {
                    System.out.println("Buzz");
                }
                else

                {
                    System.out.println(i);
                }
            }


        }
    }

}
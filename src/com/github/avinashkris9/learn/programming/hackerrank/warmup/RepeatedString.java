package com.github.avinashkris9.learn.programming.hackerrank.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {
    static long repeatedString(String s, long n) {
        long count=0;
        int stringLength=s.length();
        for(int i=0;i<stringLength;i++)
        {

            if(s.charAt(i)=='a')
            {
                count++;
            }
        }
        long occurrence =n/stringLength;
        count =count*occurrence;
        if(n%stringLength!=0)
        {
            long remaining =n%stringLength;
            for(long i=0;i<remaining;i++)
            {
                if(s.charAt((int)(i))=='a')
                {
                    count++;
                }
            }

        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println(result);




        scanner.close();
    }
}

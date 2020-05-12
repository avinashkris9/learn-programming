package com.github.avinashkris9.learn.programming.hackerrank.warmup;

import java.util.Arrays;
import java.util.List;

public class Grading {


    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        for(int i =0;i<grades.size();i++)
        {
             int x=grades.get(i);
            if(x>=38 && (x%5 !=0 && 5-(x%5)<3))
            {

                   grades.set(i,x+(5-(x%5)));

            }

        }
        return grades;
    }


    public static void main(String[] args) {

        List<Integer> grades= Arrays.asList(73,67,38,33);

        List<Integer>items =gradingStudents(grades);
        items.forEach(System.out::println);
    }
}

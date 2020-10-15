package com.github.avinashkris9.learn.programming.misc2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterOccurrences {

  public static void main(String[] args) {



      Scanner s = new Scanner(System.in);
      int testCases=Integer.parseInt(s.nextLine().trim());

      String[] strings=new String[testCases];
      int testCaseCount=0;
      while(testCaseCount<testCases)
      {
        String[] input=s.nextLine().split(" ");
        int count=0;
        int occurrences=Integer.parseInt(input[1]);
        String[] data=s.nextLine().trim().split("");
        Map<String,Integer> mapper=new HashMap<>();

        StringBuilder sb=new StringBuilder("");
        while(count<data.length)
        {

          if(mapper.containsKey(data[count]))
          {
            //		 System.out.println(data[count] +" -->"+mapper.get(data[count])+ " Occ= "+occurrences);
            if(mapper.get(data[count])<occurrences)
            {
              int x=mapper.get(data[count])+1;
              mapper.put(data[count],x);
              sb.append(data[count]);
            }
          }
          else
          { //first time I am seeing this
            mapper.put(data[count],1);
            sb.append(data[count]);
          }
          // System.out.println(count+ " _" +test);
          count++;
        }

        strings[testCaseCount]=sb.toString();
        testCaseCount++;

      }

      for(int i=0;i<strings.length;i++) System.out.println(strings[i]);


  }
}

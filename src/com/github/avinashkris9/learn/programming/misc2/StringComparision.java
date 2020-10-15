package com.github.avinashkris9.learn.programming.misc2;

import java.util.Scanner;

public class StringComparision {

  public static void main(String[] args) {


    Scanner scanner=new Scanner(System.in);
    int testCases=Integer.parseInt(scanner.nextLine().trim());
    int i=0;
    while(testCases-- >0)
    {

        String x=scanner.nextLine().trim();

      char[] str1=x.toCharArray();
      x=scanner.nextLine().trim();
      char[] str2=x.toCharArray();
      //  System.out.println(" Tring "+new String(str1)+ " and "+new String(str2));
      // str1= recurrence(str1,str2,0,0);

      // System.out.println(  counter(str1));
      if(recursion(str1,str2,str1.length-1,str2.length-1))
      {
        System.out.println((i+1)+ " YES");
      }
      else
      {
        System.out.println((i+1)+ " NO");
      }
     // System.out.println((i+1)+ " "+ recursion(str1,str2,str1.length-1,str2.length-1));
      i++;
    }




  }



  static boolean recursion(char[] str1, char[]str2,int l1,int l2)
  {
//   System.out.println(" Str1["+l1+"]="+new String(str1)+ " Str2["+l2+"]= "+new String(str2));
      if(l1==0 && l2==0) return true;
    if(l1>=0 && l2<0)
    {
      if(Character.isLowerCase(str1[l1]))  return true; //we can always drop
     return false; //upper case character
    }
    if(l2>=0 &&l1<0) return false;

    if(str1[l1]==str2[l2])
    {
        return recursion(str1,str2,l1-1,l2-1);
    }

  if(Character.isLowerCase(str1[l1]))
  {

    if(Character.toUpperCase(str1[l1])==str2[l2])
    {

      char[] arr=str1.clone();
      arr[l1]=Character.toUpperCase(str1[l1]);

      return recursion(str1,str2,l1-1,l2-1) || recursion(str1,str2,l1-1,l2);
    }
    else
    {
     //   System.out.println("Not matching");
      return recursion(str1,str2,l1-1,l2);
    }
  }
   // System.out.println("Hey");
    if(Character.isUpperCase(str1[l1])) return false;
    return true;


  }

}

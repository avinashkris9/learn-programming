package com.github.avinashkris9.learn.programming.misc2;



import java.io.*;
import java.util.*;
class  StringConvert
{
  static boolean testAllUpperCase(String str){
    for(int i=0; i<str.length(); i++){
      char c = str.charAt(i);
      if(c >=97) {
        return false;
      }
    }
    //str.charAt(index)
    return true;
  }

  static boolean compareString(String str,String str2){
    if(str.length()!=str2.length())return false;

    for(int i=0; i<str.length(); i++){
      if(str.charAt(i)!=str2.charAt(i))
        return false;
    }
    //str.charAt(index)
    return true;
  }
  static String stringCheck(StringBuilder str1,StringBuilder str2 )
  {
    String result=new String();
    boolean flag=true;
    int i=0;

    while(i<str1.length())
    {
      System.out.println("str1= "+str1+ "i= "+i+ " str2= "+str2);
      if(   compareString(str1.toString(),str2.toString()) )
      {
        result="Yes";
        break;
      }

      if(testAllUpperCase(str1.toString()) ){
        result="No";
        break;
      }

      if (str1.charAt(i) != str2.charAt(i)) {
        if (Character.isLowerCase(str1.charAt(i))) {

          // it's small letter. we look for a match
          if (str2.charAt(i) == str1.charAt(i)) continue;

          // see if there is an upper case char waiting
          if (Character.toUpperCase(str1.charAt(i)) == str2.charAt(i)) {
            // str1 got lowercase and str2 got uppercase
            // so we can covert str1.
            str1.setCharAt(i, str2.charAt(i));

          } else {

            // nothing matches. drop it
            str1.deleteCharAt(i);
          }
        }
}
      i++;
    }


    return result;

  }
  public static void main (String[] args) throws java.lang.Exception
  {

    Scanner s = new Scanner(System.in);
    int testCases=Integer.parseInt(s.nextLine().trim());
    int i=0;
    String[] results=new String[testCases];
    while(i<testCases)
    {

      StringBuilder str1=new StringBuilder(s.nextLine().trim());
      StringBuilder str2=new StringBuilder(s.nextLine().trim());
      results[i]=stringCheck(str1,str2);
      i++;
    }
    for(int j=0;j<testCases;j++){  System.out.println("YES");}

  }
}
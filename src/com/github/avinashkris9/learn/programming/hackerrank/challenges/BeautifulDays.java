package com.github.avinashkris9.learn.programming.hackerrank.challenges;

/*

https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
 */
public class BeautifulDays {

  // Complete the beautifulDays function below.
  static int beautifulDays(int i, int j, int k) {

    //reverse the number, find the absolute difference, divde by k
    int days=0;
    for(int num=i;num<=j;num++)
    {
      int reversed=reverse(num);
      float abso=Math.abs(reversed-num);



      if(abso/k ==(int)abso/k)days++;
    }

  return days;
  }

 static int reverse(int num)
  {
    int reversed=0;
    while(num>0)
    {
      int dig=num%10;
      reversed=reversed*10+dig;
      num/=10;
    }
    return reversed;
  }
  public static void main(String[] args) {

    System.out.println(beautifulDays(20 ,23 ,6));
  }
}

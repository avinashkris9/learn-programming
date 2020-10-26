package com.github.avinashkris9.learn.programming.java.concepts;

import java.util.Collections;

public class MethodOverloadingAndOverriding {



  public static void main(String[] args) {

    Overloading overloading=new Overloading();

  }
}

class Overloading //same method name, but different signature. Same functon but different type of data!
{
  int area( int length,int breadth)
  {
    return length*breadth;
  }

  double area(int side)
  {
    return side*side;
  }
}
class BaseClass
{
  public int area(int length,int breadth)
  {
    return length*breadth;
  }
}
class ChildClass extends  BaseClass

{
  public int area(int length) // just an overloaded function.
  {
    return length*length;
  }
  @Override
  public int area(int length,int breadth) //same method name,same signature but overriding parent class method.
  {
    return length*breadth;
  }


}
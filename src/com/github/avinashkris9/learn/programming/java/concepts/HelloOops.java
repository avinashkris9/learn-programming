package com.github.avinashkris9.learn.programming.java.concepts;

public class HelloOops {

  public static void main(String[] args) {
    //

    Shape s=new Circle();
    System.out.println(s.area(4));
    s=new Square();
    System.out.println(s.area(4));
  }
}


abstract  class Shape{

 abstract double area( double l);
}

class Circle extends Shape{

  @Override
  double area( double r) {
    return 2*3.14*r;
  }
}
  class Square extends Shape
  {
    @Override
    double area( double r) {
      return r*r;
  }
  }
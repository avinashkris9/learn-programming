package com.github.avinashkris9.learn.programming.java.introduction;

public class HelloWorld  {


  public static void main(String[] args){

    Test a =new Test("A");
    Test b=new Test("B");
    a.start();
    b.start();

  }

}

class Test implements  Runnable{


  private Thread t;
  private  String threadName;

  Test(String threadName)
  {
    this.threadName=threadName;
  }

  public void start() {
    if(t==null)
    {
      t =new Thread(this,threadName);
      t.start();;
    }

  }

  @Override
  public void run() {
    while (true) System.out.print(threadName);
  }
}




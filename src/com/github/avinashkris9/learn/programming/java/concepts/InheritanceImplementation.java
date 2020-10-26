package com.github.avinashkris9.learn.programming.java.concepts;

/*

Implementation of inheritance.
A. Abstract class is used for implementation inheritance.
1. Parent class default constructor is called implicitly when child object is created. It's the first statement executed on child constructor.
2. If there is parametrized constructor, super keyword should be used to explictly call parent class parametrized constructor.
3. super keyword should the first statement.
4. super.functionName() format can be used to re-use the parent class function.
 */
public class InheritanceImplementation {


  public static void main(String[] args){

    Account ac =new SavingsAccount() ;
    ac.calculateInterest(12);
    ac.deposit(12);
  }
}


 abstract class Account {
   Account(int amount)
   {
     System.out.println("Welcome to  Account. I am the constructor");
   }
  public void deposit (double amount) {
    System.out.println("depositing " + amount);
  }
  public void withdraw (double amount) {
    System.out.println ("withdrawing " + amount);
  }
  public abstract double calculateInterest(double amount);
}

class SavingsAccount extends Account {

  SavingsAccount()
  {
    super(12);
    System.out.println("Welcome to Savings Account. I am the constructor");

  }

  public double calculateInterest(double amount) {
    // calculate interest for SavingsAccount
    return amount * 0.03;
  }

  public void deposit(double amount) {
    //  super.deposit(amount); // get code reuse
    // do something else
    System.out.println("SavingsAccount Deposit "+amount);
    super.withdraw(amount);
  }

  public void withdraw(double amount) {

    super.withdraw(amount);
  }
  }
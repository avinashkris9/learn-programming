package com.github.avinashkris9.learn.programming.java.concepts;

/**
 *
 * Inheritance through Interface composition
 * Benefit is one implementation can be easily replaced with another interface implementaion.
 *
 */
public class CodingToInterface {

  public static void main(String[] args) {
    //
    String s="12";

    AccountSb sb=new SavingsAccountImpl();
    sb.calculateInterest(12);
    sb.deposit(12);
  }



}


 interface AccountSb {
   double calculateInterest(double amount); //public abstract by default since it is an interface!
   public abstract void deposit(double amount);
   public abstract void withdraw(double amount);
}

interface AccountHelper
{
  void deposit(double amount);
  void withdraw(double amount);
}

class AccountHelperImpl implements AccountHelper
{

  @Override
  public void deposit(double amount) {
    System.out.println("depositing " + amount);
  }

  @Override
  public void withdraw(double amount) {
    System.out.println("withdrawing " + amount);
  }
}

class SavingsAccountImpl implements AccountSb{


  //composed helper class.
  AccountHelper accountHelper =new AccountHelperImpl(); // we are going te reuse the existing implementation

  @Override
  public double calculateInterest(double amount) {
    return 0;
  }

  @Override
  public void deposit(double amount) {
  accountHelper.deposit(amount); //code reuse.!
  }

  @Override
  public void withdraw(double amount) {
  accountHelper.withdraw(amount);
  }
}
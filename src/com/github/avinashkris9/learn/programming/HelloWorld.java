package com.github.avinashkris9.learn.programming;

import java.util.Arrays;
import java.util.Optional;

public class HelloWorld {

  private String address;

  public void setAddress(String Address){
    address = Address;
  }

  public String getAddress(){
    return address;
  }

  static String retrievePersonAddressById(int number)
  {
Optional x =Optional.empty();
String xad =null;
    return xad;
  }

  public static void main(String[] args) {

    HelloWorld person = new HelloWorld();
    Optional<String> addr = Optional.of(retrievePersonAddressById(5));
    if (addr.isPresent()) {
      person.setAddress(addr.get());
    }
    else { System.out.println("Avinash");}

    System.out.println(person.getAddress());
  }
}

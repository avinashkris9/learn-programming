package com.github.avinashkris9.learn.programming.java.concepts;

import java.util.Arrays;

/**
 * In java when we pass an object ,its the reference value that is getting passed.
 * So if we dont make class immutable, the value can be modifed by simply changing the value at the referrence
 * .
 */
public class DefensiveCopying {

  public static void main(String[] args) {

    //
    int[] myArray={1,2};
    Home home =new Home(myArray); //passing reference of array myArray
    System.out.println(home);
    myArray[1]=12;    // now changing myArray;
    System.out.println(home);  // the value on object home got changed!

    // How to create immutable class ? see Hell class below
    int[] myArray2={1,2};
    Hell hell =new Hell(myArray2); //passing reference of array myArray
    System.out.println(hell);
    myArray2[1]=12;    // now changing myArray;
    System.out.println(hell);  // the value on object home got changed!

  }
}

class Home {
  private final int[] myArray;

  Home(int[] myArray) {

    this.myArray = myArray;
  }

  @Override
  public String toString() {
    return "Home{" + "myArray=" + Arrays.toString(myArray) + '}';
  }
  }
  class Hell{

    private final int[] myArray;

    Hell(int[] myArray)

    {
      this.myArray=myArray.clone(); // key is clone method. which always make a copy of the reference passed rather than pointing the reference. This makes data security.Now you wont be able to edit data;
    }

    @Override
    public String toString() {
      return "Hell{" +
          "myArray=" + Arrays.toString(myArray) +
          '}';
  }

}

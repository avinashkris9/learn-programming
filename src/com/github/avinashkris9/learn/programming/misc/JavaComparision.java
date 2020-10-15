package com.github.avinashkris9.learn.programming.misc;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Comparator vs Comparable interfaces
When we want to compare objects using Collection.sort we need help of Comparator or Comparable.
We can also use Java 8 ComaringByInt functionality for comparison

Comparable - A comparable object is capable of comparing itself with another object. Class implements Comparable interface and this is mainly used for natural ordering.Comparable means a single way to comprare the bean class. So same class implements this interface to sort it . COllection.sort automatically use the compareTo logic for any class that implements comparable.

Comparator - This object is capable of comparing  2 different objects. It compares objects of a different class. We can define multiple comparator interface definitions so that we can sort the objects in multiple ways.
https://www.digizol.com/2008/07/java-sorting-comparator-vs-comparable.html

Comparable and Comparator are generic interfaces that allow to compare instances of the type defined in the generic (subclasses included).

The main difference between them is that Comparable is directly implemented in the class which you want to compare objects.

Consequently, if you have a single way to compare instances from a class, that is that you have a natural order for them, Comparable is the right approach.
On the other hand, if you have multiple ways to compare instances from a class, Comparable is not enough.
You should use Comparators instead (if it doesn't exist a natural order) or use both (if it exists a natural order and some other kinds of order).
 */
public class JavaComparision  {


  public static void main(String[] args) {



  List<Person> testUsers= Arrays.asList(new Person("Shaji",26), new Person("Chappan",29),new Person("Shameer",41), new Person("Xavier",12));

    System.out.println(testUsers);
    Collections.sort(testUsers);
    System.out.println(testUsers);

    System.out.println(" Using Comparator");
    List<Person> userList= Arrays.asList(new Person("Shaji",26), new Person("Chappan",29),new Person("Shameer",41), new Person("Xavier",12));
    System.out.println(userList);
    Collections.sort(userList,new PersonNameSorter());
    System.out.println(userList);

    System.out.println("Java 8 sorting with number");
    //one simple way to sort using java 8
    List<Users> java8Persons= Arrays.asList(new Users("Shaji",26), new Users("Chappan",29),new Users("Shameer",41), new Users("Xavier",12));
    System.out.println(java8Persons);
    Collections.sort(java8Persons,Comparator.comparingInt( Users::getAge));
    System.out.println(java8Persons);
 
  }


}

class Users {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Users{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  public Users(String name, int age) {
    this.name = name;
    this.age = age;
  }
  }
class Person implements Comparable
{

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;


  }

  /*
   CompareTo decides the sorting order, if it is -1 means lhs <rhs , >1 if lhs >rhs
   so ascending order sort ? then
   */
  @Override
  public int compareTo(Object o) {
    Person p =(Person)o;
    return this.age-p.age;
  }
}

class PersonNameSorter implements Comparator<Person>{

  /*
  Comparator need to override compare method and equals method.
   */
  @Override
  public int compare(Person o1, Person o2) {

    if (o1.getAge() <= o2.getAge()) {
      return -1;

    } return 1;
 }
}
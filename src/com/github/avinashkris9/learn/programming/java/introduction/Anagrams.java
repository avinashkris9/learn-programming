package com.github.avinashkris9.learn.programming.java.introduction;

/*
https://www.hackerrank.com/challenges/java-anagrams
 */
public class Anagrams {

  static boolean isAnagram(String a, String b) {
    // Complete the function

    if (a.length() != b.length()) return false;
    a=a.toLowerCase(); // case insensitive
    b=b.toLowerCase();
    java.util.Map<Character, Integer> wordCount = new java.util.HashMap<>();
    for (int i = 0; i < a.length(); i++) {
      if (wordCount.containsKey(a.charAt(i)))
        wordCount.put(a.charAt(i), wordCount.get(a.charAt(i)) + 1);
      else wordCount.put(a.charAt(i), 1);
    }

    for (int i = 0; i < b.length(); i++) {
      char word = b.charAt(i);

      if (wordCount.containsKey(word)) {

      int freq=wordCount.get(word);
      if(freq ==0) return false;
      else
        wordCount.put(word,--freq);
      }
      else return false;
    }
    return true;
    }

  public static void main(String[] args) {

    System.out.println( isAnagram("anagramm","marganaa"));
  }
}

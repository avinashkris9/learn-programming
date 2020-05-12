package com.github.avinashkris9.learn.programming.text;

import java.util.Scanner;

/**
 *
   Pig Latin is a game of alterations played on the English language game.
   To create the Pig Latin form of an
For words that begin with consonant sounds, all letters before the initial vowel are placed at the end of the word
sequence. Then, "ay" is added,
When words begin with consonant clusters (multiple consonants that form one sound), the whole sound is added to the end
For words that begin with vowel sounds, the vowel is left alone, and most commonly 'ay' is added to the end.
 */
public class PigLatin {


    public static void pigLatin(String inputString) {


        StringBuilder pigLatino = new StringBuilder();

        //scroll through the characters, if vowel is found, break the chain and move the character to the end.
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'A' || inputString.charAt(i) == 'I' ||
                    inputString.charAt(i) == 'E' || inputString.charAt(i) == 'O' || inputString.charAt(i) == 'U'
                    || inputString.charAt(i) == 'a' || inputString.charAt(i) == 'i' ||
                    inputString.charAt(i) == 'e' || inputString.charAt(i) == 'o' || inputString.charAt(i) == 'u') {

                pigLatino.append("ay");


                pigLatino.insert(0, inputString.substring(i));

                break;
            } else {


                pigLatino.append(inputString.charAt(i));


            }
        }
        System.out.println(inputString + " ----> " + pigLatino);
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
//
        /// String inputString = scanner.next();
        pigLatin("pig");
        pigLatin("latin");
        pigLatin("banana");
        pigLatin("will");
        pigLatin("butler");
        pigLatin("happy");
        pigLatin("duck");
        pigLatin("me");
        pigLatin("smile");
        pigLatin("string");
        pigLatin("stupid");
        pigLatin("glove");
        pigLatin("trash");
        pigLatin("floor");
        pigLatin("store");
        pigLatin("eat");
        pigLatin("omelet");
        pigLatin("are");
        pigLatin("egg");
        pigLatin("explain");
        pigLatin("always");
        pigLatin("ends");
        pigLatin("honest");
        pigLatin("I");


    }
}

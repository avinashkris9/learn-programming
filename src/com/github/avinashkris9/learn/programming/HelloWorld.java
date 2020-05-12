package com.github.avinashkris9.learn.programming;

import java.util.Arrays;

public class HelloWorld {
   private int[] scores;

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = new int[scores.length];
        System.arraycopy(scores, 0, this.scores, 0, scores.length);
    }

    void displayScores()
    {
        for (int i = 0; i < this.scores.length; i++) {
            System.out.print(this.scores[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] myScores = {5, 5, 4, 3, 2, 4};
        HelloWorld helloWorld=new HelloWorld();
        helloWorld.setScores(myScores);
        helloWorld.displayScores();
        myScores[1] = 1;
        helloWorld.displayScores();

    }

}

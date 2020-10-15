package com.github.avinashkris9.learn.programming.misc2;

import java.util.*;
/*

https://www.hackerearth.com/practice/basic-programming/recursion/recursion-and-backtracking/practice-problems/algorithm/biggest-forest-700592dd/submissions/
 */
public class Metrics {

  //
  static int count;

  private String[][] metrix;

  Metrics(String[][] metrix) {
    this.metrix = metrix;
  }

  static void printer(String[][] metrix) {
    for (int i = 0; i < metrix.length; i++) {
      for (int j = 0; j < metrix.length; j++) {
        System.out.print(metrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  int counter() {
    int area = -1;
    int counter = 0;
    for (int i = 0; i < metrix.length; i++) {
      {
        for (int j = 0; j < metrix.length; j++) {
          if (metrix[i][j].equalsIgnoreCase("T")) {
            count = 0;
            int result = dfs(i, j, metrix);
            System.out.println("Maximum= "+area+ " Count = "+count);
            area = Math.max(area, count);

            // printer(metrix);
          }
        }
      }
    }
    return area;
  }

  int dfs(int row, int column, String[][] metrix) {
    //    int[] rv =  new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
    //
    //    int[] cv =  new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };


    int[] rv = new int[] {0, -1, 0, 1};

    int[] cv = new int[] {-1, 0, 1, 0};

     System.out.println(row + " "+column);
    for (int i = 0; i < rv.length; i++) {

      int x = row + rv[i];
      int y = column + cv[i];

      if (canMove(x, y, metrix)) {


        System.out.println("DFS on "+x+","+y+ "Count =="+count);
        dfs(x, y, metrix);
      }
    }

    return count;
  }

  boolean canMove(int row, int column, String[][] metrix) {

    if (row >= 0
        && row < metrix.length
        && column >= 0
        && column < metrix.length
        && metrix[row][column].equalsIgnoreCase("T")
        && !metrix[row][column].equals("V")) {
      metrix[row][column] = "V";
      count++;
      return true;
    } else return false;

    // }
    // }

  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int size = Integer.parseInt(scanner.nextLine().trim());
    String[][] theMetrix = new String[size][size];

    int counter = 0;
    while (counter < size) {

      String[] s = scanner.nextLine().split("");

      for (int i = 0; i < size; i++) {

        theMetrix[counter][i] = s[i].trim();
      }

      counter++;
    }

    // printer(theMetrix);
    Metrics metrics = new Metrics(theMetrix);
    // metrics.dfs(0,0,theMetrix);


    System.out.println(metrics.counter());
    // printer(theMetrix);

  }
  }

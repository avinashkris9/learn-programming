package io.learn.algorithms.search;

public class LinearSearch {


    public static void main(String[] args) {
        // write your code here

        int[] arr = {4, 9, 2, 5, 7, 6, 1};

        int numberToSearch = 22;

        LinearSearch searchObj = new LinearSearch();
        searchObj.linearSearch(arr, numberToSearch);
        numberToSearch = 5;
        searchObj.linearSearch(arr, numberToSearch);
    }

    /*
     search each element by element
     */
    public void linearSearch(int[] arr, int numberToSearch) {
        System.out.print("Linear Search for number " + numberToSearch + " --> ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                System.out.println(numberToSearch + " present at position " + i);
                return;
            }
        }
        System.out.println("Number " + numberToSearch + " not found");


    }
}

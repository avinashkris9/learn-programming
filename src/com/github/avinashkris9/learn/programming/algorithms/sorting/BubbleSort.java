package com.github.avinashkris9.learn.programming.algorithms.sorting;

public class BubbleSort {


    public static void main(String[] args) {

        int[] unSortedArray = {2, 9, 3, 1, 4, 6};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.print("Unsorted Array :");
        bubbleSort.printArray(unSortedArray);


        bubbleSort.bubbleSortArray(unSortedArray);

    }

    // compare adjacent elemtns and swap if it has to be arranged.
    // after each iteration, the largest element will be bubbled to the end of array.
    // continue swapping until there are no swapping !
    public void bubbleSortArray(int[] unSortedArray) {

        int swapCounter = -1;
        for (int i = 0; i < unSortedArray.length; i++) {
            swapCounter = 0;
            for (int j = 0; j < unSortedArray.length - i - 1; j++) {


                if (unSortedArray[j] > unSortedArray[j + 1]) {
                    swapCounter++;
                    int temp = unSortedArray[j];
                    unSortedArray[j] = unSortedArray[j + 1];
                    unSortedArray[j + 1] = temp;


                }
            }
            // if there are no swaps, that means array is already sorted. No need to continue;
            if (swapCounter == 0) {
                System.out.println("No Swapping. Array is already sorted !" + i);
                break;
            }
            System.out.print("Next Iteration: ");
            printArray(unSortedArray);
        }


    }

    public void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + "\t");
        }
        System.out.println();
    }
}

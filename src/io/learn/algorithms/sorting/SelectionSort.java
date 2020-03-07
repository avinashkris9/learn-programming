package io.learn.algorithms.sorting;

public class SelectionSort {

    public static void main(String[] args) {


        int[] unSortedArray = {2, 9, 3, 1, 4, 6};
        SelectionSort selectionSort = new SelectionSort();
        System.out.print("Unsorted Array :");
        selectionSort.printArray(unSortedArray);


        selectionSort.selectionSort(unSortedArray);


    }

    /**
     * Find the smallest unsorted element make it the first element
     * Search the unsorted array for smallest
     * Swap the smallest with the first element of unsorted.
     * Repeat above when no unsorted elements.
     */


    public void selectionSort(int[] unSortedArray) {
        int size = unSortedArray.length;
        int indexOfSmallest = 0;
        int smallest;
        for (int i = 0; i < size; i++) {
            smallest = unSortedArray[i];
            indexOfSmallest = i;
            for (int j = i + 1; j < size; j++) {
                System.out.println("Comparing " + unSortedArray[j] + " and " + smallest);
                if (unSortedArray[j] < smallest) {
                    smallest = unSortedArray[j];
                    indexOfSmallest = j;

                }

            }
            System.out.println("Smallest = " + smallest + " swapping " + smallest + " with " + unSortedArray[i]);
            int temp = unSortedArray[indexOfSmallest];
            unSortedArray[indexOfSmallest] = unSortedArray[i];
            unSortedArray[i] = temp;
            System.out.println(" Iteration " + i);
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


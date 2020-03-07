package io.learn.algorithms.search;

public class BinarySearch {

    // Requires a sorted array.

    public static void main(String[] args) {

        int[] arr = {6, 7, 8, 9, 10, 11, 15, 17, 19, 22, 23, 25, 28, 30};

        int numberToSearch = 22;

        BinarySearch binarySearch = new BinarySearch();
        binarySearch.binarySearch(arr, numberToSearch);
        numberToSearch = 99;
        binarySearch.binarySearch(arr, numberToSearch);
    }

    public void binarySearch(int[] arr, int numberToSearch) {

        int start = 0;
        int end = arr.length;
        int mid = end / 2;

        while (start < end) {
            System.out.println("Search =" + numberToSearch + " Start =" + start + " Middle =" + mid + " end= " + end);
            if (arr[mid] == numberToSearch) {
                System.out.println(" Number " + numberToSearch + " found at position " + mid);
                return;
            }
            if (numberToSearch < arr[mid]) {

                end = mid - 1;
                mid = (start + end) / 2;
            }

            if (numberToSearch > arr[mid]) {
                start = mid + 1;
                mid = (start + end) / 2;
            }

        }
        System.out.println("Number " + numberToSearch + "  not found");

    }
}

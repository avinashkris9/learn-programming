package com.github.avinashkris9.learn.programming.hackerrank.warmup;

import com.github.avinashkris9.learn.programming.algorithms.sorting.BubbleSort;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

/*
 Find the number of pairs present in an array.
 Logic is to sort array and find out adjacents and calculate pairs;


 */
public class SockMerchant {

    static int[]  sorter( int n, int[] ar)
    {


        int swapCounter=-1;
        for(int i=0;i<n;i++)
        {

            swapCounter=0;
            for(int j=0;j<n - i - 1;j++)
            {

                if(ar[j]>ar[j+1])
                {

                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;

                    swapCounter++;
                }
            }
            // if there are no swaps, that means array is already sorted. No need to continue;
            if (swapCounter == 0) {

                break;
            }


        }
        return  ar;
    }
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int pairs=0;
        int pairpos=-1;
        for(int i =0;i<n-1;i++)
        {



            if(ar[i]==ar[i+1])
            {
                pairs++;
                pairpos=i+1;
                i=i+1; // increment as no need check next element as it is already belongs to another pair

            }


        }
        return  pairs;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }
        ar=sorter(n,ar);
        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

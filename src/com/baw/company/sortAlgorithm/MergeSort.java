package com.baw.company.sortAlgorithm;

public class MergeSort {





    //mergeSort Algorithm
    //input array, start, end
    // exit if end<=start
    // calculate midpoint
    //mergeSort(array,midpoint)
    // mergeSort(midpoint+1,end)
    //merge()


    //merge
    //inputs array,start,midpoint
    // create two arrays
    // compare and sort
    // move remain items





    // Complexity Classes  O(n log n)

    public static void mergeSort(int[] array, int start, int end) {

        if (end == start) return;   //


        int midpoint = (end + start) / 2;   //
        mergeSort(array, start, midpoint);
        mergeSort(array, midpoint + 1, end);

        merge(array, start, midpoint, end);

    }

    public static void merge(int[] array, int start, int midpoint, int end) {

        int i, j, k;

        int left_length = midpoint - start + 1;
        int right_length = end - midpoint;

        int[] left_array = new int[left_length];

        int[] right_array = new int[right_length];

        // compare and sort

        for (i = 0; i < left_length; i++) {

            left_array[i] = array[start + i];
        }

        for (j = 0; j < right_length; j++) {

            right_array[j] = array[midpoint + 1 + j];


        }

        i = j = 0;
        k = start;
        while (i < left_length && j < right_length) {

            if (left_array[i] <= right_array[j]) {     //

                array[k] = left_array[i];
                i++;
            } else {

                array[k] = right_array[j];
                j++;
            }

            k++;

        }

        while (i < left_length) {

            array[k] = left_array[i];
            i++;
            k++;

        }


        while (j < right_length) {

            array[k] = right_array[j];

            j++;
            k++;


        }


    }


    public static void main(String[] args) {


        int[] array = {9, 5, 1, 4};


        for (int i = 0; i < array.length; i++) {

            if (i == 0) {
                System.out.print(array[i]);
            } else
                System.out.print("," + array[i]);
        }

        System.out.println();

        System.out.println("**************");

        mergeSort(array, 0, array.length-1);

        for (int i = 0; i < array.length; i++) {

            if (i == 0) {
                System.out.print(array[i]);
            } else
                System.out.print("," + array[i]);
        }


    }
}

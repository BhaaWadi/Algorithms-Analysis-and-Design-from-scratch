package com.baw.company;

public class BinarySearch {



  //  Complexity Classes   O(log n)



    public static int binarySearch(int[] array, int key) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {

            int midpoint = (start + end) / 2;
            if (key == array[midpoint]){
                System.out.println("dsawdasd");
                return midpoint;
            }

            else {

                if (key > array[midpoint]) start = midpoint + 1;

                else end = midpoint - 1;
            }

        }


        return -1;

    }


    public static void main(String[] args) {


        int []array= {1,2,3,4,5,6,7,8};


      int index=  binarySearch(array,6);
        System.out.println( index );


    }

}

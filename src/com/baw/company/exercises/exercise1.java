package com.baw.company.exercises;

import java.util.ArrayList;
import java.util.List;

public class exercise1 {

    //Segregate positive and negative numbers

    //use Mergesort technique

    //Input: [9, -3, 5, -2, -8, -6, 1, 3]
    //Output: [-3, -2, -8, -6, 9, 5, 1, 3]


    public static void segregate(int[] array, int start, int end) {

        if (end <= start) return;

        int midpoint = (end + start) / 2;

        segregate(array, start, midpoint);
        segregate(array, midpoint + 1, end);
        merge(array, start, midpoint, end);

    }

    public static void merge(int[] array, int start, int midpoint, int end) {

        int i, j, k;

        int left_length = midpoint - start +1;
        int right_length = end - midpoint;

        int [] left_array = new int[left_length];
        int [] right_array = new int[right_length];

        for(i=0; i < left_length;i++){

            left_array[i] = array[start+i];
        }

        for (j=0; j < right_length ;j++){

            right_array[j] = array[ midpoint + 1 + j];
        }

        i = j = 0;
        k = start ;


        while (i < left_length && left_array[i] <=0 ){

            array[k] =left_array[i];

            i++;
            k++;

        }

        while ( j < right_length && right_array[j] <= 0){

            array[k] = right_array [j];
            j++;
            k++;
        }


        while (i <left_length){


            array[k] = left_array[i];

            i++;
            k++;
        }

        while (j < right_length){

            array[k] = right_array[j];

            j++;
            k++;
        }




    }


    public static void main(String[] args) {

       int[] array = {6, -5, 12, 10, -9, -1};


        for (int i = 0; i < array.length; i++) {

            if (i == 0) System.out.print(array[i]);
            else System.out.print("  " + array[i]);

        }

        System.out.println();

        /// The first solution
//
//        segregate(array, 0, array.length-1);
//        System.out.println("***** result ****");
//        for (int i = 0; i < array.length; i++) {
//
//            if (i == 0) System.out.print(array[i]);
//            else System.out.print("  " + array[i]);
//
//        }



        // The second solution

     List<Integer>  result=  segregate2(array);

        System.out.println("***** result ****");
        for (int i = 0; i < result.size(); i++) {

            if (i == 0) System.out.print(result.get(i));
            else System.out.print("  " + result.get(i));

        }



    }




    public static List<Integer> segregate2( int [] array){

        List<Integer>  negative=new ArrayList<>();

        List<Integer> positive= new ArrayList<>();


        for (int i = 0 ; i <array.length ; i++) {

            if (array[i]<= 0) negative.add(array[i]);
            else positive.add(array[i]);
        }


        negative.addAll(positive);

        return  negative;





    }






}

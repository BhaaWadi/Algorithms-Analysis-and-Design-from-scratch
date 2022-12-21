package com.baw.company.sortAlgorithm;

public class insertionSort {


    public static void main(String[] args) {


        int[]x={9,5,1,4,3};
       int[] result = insertion(x);

       for (int i =0;i<result.length;i++){

           System.out.println(result[i]);
       }

    }


    public static int[] insertion(int[]numbers){

        for (int i=1 ;i<numbers.length;i++){
           int j;
          int key=numbers[i];

          for ( j=i-1;j>=0;--j){

              if (numbers[j]>key) numbers[j+1]=numbers[j];
              else
                  break;

          }

            numbers[j+1]=key;
        }

    return numbers;

    }
}

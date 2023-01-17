package com.baw.company.greedyTechnique;

import java.util.ArrayList;

public class GreedyActivitySelector {

//    inputs two arrays, Start and End.
//    results is array to return activity index
//    activity 0 added by default to results
//
//    i is index for start array = 1
//    jis index for End array = 0
//
//    loop from i to Start array length - 1
//            - if Start{i] >= End[j]
//          then
//                - add i to results array
//                    j=i

//     return result


//    Criteria or Restrictions
//    Sorted by end time


    //Time complexity O(N)      rate  Fair

    public static ArrayList<Integer> greedyActivitySelector(int[] start, int[] end) {

        ArrayList<Integer> result = new ArrayList<>();
        result.add(0);

        int j = 0;
        for (int i = 1; i < start.length; i++) {

            if (start[i] >= end[j]) {
                result.add(i);
                j = i;
            }
        }

        return result;
    }


    public static void main(String[] args) {

        int[] start = {9, 10, 11, 12, 13, 15};
        int[] end = {11, 11, 12, 14, 15, 16};

        ArrayList<Integer> result = greedyActivitySelector(start, end);

        for (Integer integer : result) {

            System.out.print(integer + "    ");
        }

    }
}

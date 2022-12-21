package com.baw.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here


         //Calculate the  area Rhombus
//        System.out.println(areaRhombus(8,6));
//        System.out.println(areaRhombus(12,7));


     //   System.out.println("***********************");
//
      //  Calculate Trapezoid
//
//        System.out.println(areaTrapezoid(8,9,8));
//        System.out.println(areaTrapezoid(3,5,7));


        ////// Calculate Standard Deviation
       //    i,n,avg,a,b,sd=0;

//     int n;
//       double avg,a,b,sd;
//      avg=a=0;
//       double[] x;
//
//
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("enter the  length array");
//
//        n=scanner.nextInt();
//     x=new double[n];
//        for (int i=0;i<n;i++){
//
//            System.out.println("enter the [x]"+i);
//            x[i]=scanner.nextInt();
//            avg +=x[i];
//        }
//
//        avg =avg /n ;
//
//        for (int i =0;i<n;i++){
//
//            a += Math.pow( x[i] - avg,2);
//        }
//
//        b = a/ n;
//
//        sd= Math.sqrt(b);
//
//        System.out.println("result the Standard Deviation : " + sd);



        //////// Calculate Correlation

//        sumXy,resultA,sumX,sumY,resultB,
//        result1,sumSqrX,powerSumX,resultA,
//        SumSqrY,powerSumY,resultB,result2,endResult
//        int n, sumXy, sumX, sumY;
//        int[] x;
//        int[] y;
//        n = sumXy  = sumX = sumY  = 0;
//
//        double endResult,sumSqrX,sumSqrY, powerSumX,resultA,resultB, result1, result2,
//        powerSumY;
//        endResult=sumSqrX=sumSqrY=powerSumX=powerSumY=resultA=resultB =result1= result2= 0.0;
//
//        Scanner scannenr = new Scanner(System.in);
//        System.out.println("enter the array length");
//        n = scannenr.nextInt();
//        x = new int[n];
//        y = new int[n];
//
//        System.out.println(" X array ");
//        for (int i=0;i<n;i++){
//
//            System.out.println("enter the x"+i);
//            x[i]=scannenr.nextInt();
//        }
//        System.out.println(" Y array ");
//        for (int i=0;i<n;i++){
//
//            System.out.println("enter the Y"+i);
//            y[i]=scannenr.nextInt();
//        }
//
//
//        for (int i =0 ;i<n;i++){
//
//            sumXy += x[i] *y[i];
//
//            sumX +=x[i];
//            sumY +=y[i];
//
//            sumSqrX +=Math.pow(x[i],2);
//            sumSqrY +=Math.pow(y[i],2);
//        }
//
//        resultA = sumXy* n;
//        resultB = sumX * sumY;
//        result1= resultA - resultB;
//
//        sumSqrX =sumSqrX *n ;
//
//        powerSumX = Math.pow(sumX,2);
//
//        resultA = Math.sqrt(sumSqrX -powerSumX);
//
//        sumSqrY =sumSqrY * n;
//
//        powerSumY = Math.pow(sumY,2);
//
//        resultB = Math.sqrt(sumSqrY-powerSumY);
//
//        result2= resultA * resultB;
//
//        endResult = result1 / result2 ;
//
//        System.out.println(" Correlation result : " +(int) Math.cbrt(endResult));


        // calculate factorial

        System.out.println(factorial(5));









    }

    public static int factorial(int numberFactorial){

        if (numberFactorial==1){
            return 1;
        }
        else {
            return numberFactorial * factorial(numberFactorial - 1);
        }

    }

    public static double areaRhombus(double baseLength, double Height) {

        return baseLength * Height;

    }

    public static double areaTrapezoid(double length1
            , double length2
            , double height) {


        return 1 / 2f * (length1 + length2) * height;
    }



}



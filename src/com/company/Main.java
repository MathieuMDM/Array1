package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntArray = new int[20];
//        int[] myIntArray = { 1,2,3,4,5,6,7,8,9,10};
//        int[] myIntArray = new int[10];
//        myIntArray = new int[10];
//        myIntArray[5] = 50;
//        myIntArray[4] = 440;
//        myIntArray[3] = 360;
//        myIntArray[2] = 220;
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 1;
        }
//        printArray(myIntArray);

        int[] myIntegers = getIntegers(5);
                for (int i=0; i<myIntegers.length; i++) {
                    System.out.println("element " + i + ", value is " + myIntegers[i]);
                }
        System.out.println("the average is " + getAverage(myIntegers));
    }


//        for (int i=0; i<myIntArray.length; i++){
//            System.out.println("element " + i + ", value is " + myIntArray[i]);
//        }


//        double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[5]);
//        System.out.println(myIntArray[4]);
//        System.out.println(myIntArray[9]);
//
//        public static int[] printArray(int[] array) {
//            for (int i = 0; i < array.length; i++) {
//                System.out.println("element " + i + ", value is " + array[i]);
//            }
//        }

        public static int[] getIntegers(int number){
                System.out.println("enter " + number + " integres values.\r");
                int[] values = new int[number];

                for(int i=0; i<values.length; i++){
                    values[i] = scanner.nextInt();
                }
                return values;
            }

        public static double getAverage(int[] array) {
            int sum = 0;
                for (int i=0; i<array.length; i++) {
                    sum += array[i];
                }
            return (double) sum / (double)array.length;
        }


}

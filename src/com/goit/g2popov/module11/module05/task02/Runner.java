package com.goit.g2popov.module11.module05.task02;

import java.util.Random;

/**
 * Class {@code Runner} demonstrates array sorting using two methods Bubbles and Binary tree
 * @author Andrii Popov
 */

public class Runner {
        public static void main(String[] args) {

                // Initialize an array and print it
                int sampleArray[] = arrayInitializer(15000);
                SortArray testArray = new SortArray(sampleArray);
                System.out.println("Initial array is:");
                //System.out.println(testArray.toString());

                // Sort the array with Bubbles method
                long startTime = System.currentTimeMillis();
                testArray.sortArray();
                long stopTime = System.currentTimeMillis();
                System.out.println("Sorted by Bubbles method array is:");
                //System.out.println(testArray.toString());
                showTime("Bubbles sorting took: ", startTime, stopTime);

                // Sort the array with Binary Tree method
                SortArray testArray2 = new SortArray(sampleArray);
                System.out.println("Initial array is:");
                //System.out.println(testArray2.toString());

                System.out.println("Sorted by Binary tree method array is:");
                startTime = System.currentTimeMillis();
                testArray2.sortArrayBinaryTree();
                stopTime = System.currentTimeMillis();
                //System.out.println(testArray2.toString());
                showTime("Tree sorting took: ", startTime, stopTime);
                System.out.println("Job is done!");
        }

        /**
         * Populates the array with N elements
         * @param length
         * @return an array of integers from 0 to 1000
         */
        private static int[] arrayInitializer(int length) {
                int[] myArray = new int[length];
                Random rand = new Random();
                for (int i = 0; i < length; i++) {
                        myArray[i] = rand.nextInt(1000);
                }
                return myArray;
        }

        /**
         * Calculates the time taken
         * @param comment
         * @param entryPoint
         * @param endPoint
         */
        private static void showTime(String comment,long entryPoint, long endPoint) {
                long elapsedTime = endPoint - entryPoint;
                System.out.println(comment+elapsedTime+" msec");
        }
}

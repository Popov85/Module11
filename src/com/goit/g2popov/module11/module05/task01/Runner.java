package com.goit.g2popov.module11.module05.task01;

import java.util.Random;

/**
 * Class {@code Runner} demonstrates finding min and max elements of an array
 * @author Andrii Popov
 */

public class Runner {
        public static void main (String[] args) {

                // Initialize an array of N elements
                int specimen[] = arrayInitializer(20);
                MinMaxFinder minMaxInstance = new MinMaxFinder(specimen);
                // Print out the initial array
                System.out.println(minMaxInstance.toString());
                // Print the min and max elements of the array
                System.out.println("Maximum is: " + minMaxInstance.getMaximalNumber());
                System.out.println("Minimum is: " + minMaxInstance.getMinimalNumber());
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

}

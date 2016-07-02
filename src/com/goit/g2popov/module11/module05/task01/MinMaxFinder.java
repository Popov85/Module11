package com.goit.g2popov.module11.module05.task01;

/**
 * Class {@code MinMaxFinder} realizes two algorithms of finding:
 * min and max elements of an array:
 * @author Andrii Popov
 */

public class MinMaxFinder {

        // Actual array
        private int intArray[];

        public MinMaxFinder(int intArray[]) {
              this.intArray = intArray;
        }

        /**
         * Finds minimal element of the array
         * @return min element
         */
        public int getMinimalNumber() {
                int minimum = intArray[0];
                for (int i = 1; i<intArray.length; i++) {
                       if (intArray[i] < minimum) {
                               minimum = intArray[i];
                       }
                }
                return minimum;
        }

        /**
         * Finds the maximal element of the array
         * @return max element
         */
        public int getMaximalNumber() {
                int maximum = intArray[0];
                for (int i = 1; i<intArray.length; i++) {
                        if (intArray[i] > maximum) {
                                maximum = intArray[i];
                        }
                }
                return maximum;
        }

        @Override
        public String toString() {
                String arrayString = "";
                for (int i = 0; i<intArray.length; i++) {
                        arrayString = arrayString + intArray[i]+" ";
                }
                return arrayString;
        }
}

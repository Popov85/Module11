package com.goit.g2popov.module11.module04.task03;

/**
 * Created by Андрей on 30.05.2016.
 */
public class Runner {
        public static void main(String[] args) {
                DistanceMeasurer myMeasurer = new DistanceMeasurer(4.4d, 3.4d, 6.4d, 9.9d);
                System.out.println(myMeasurer.measureDistance());
        }
}

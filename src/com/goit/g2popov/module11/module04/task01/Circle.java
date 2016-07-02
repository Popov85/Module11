package com.goit.g2popov.module11.module04.task01;

/**
 * Created by Андрей on 30.05.2016.
 */
public class Circle implements Shape {

        public double calculateArea(double[] sides) {
                double theArea = Math.PI*Math.pow(sides[0],2);
                return theArea;
        }

}

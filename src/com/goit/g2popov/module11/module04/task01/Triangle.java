package com.goit.g2popov.module11.module04.task01;

/**
 * Created by Андрей on 29.05.2016.
 */
public class Triangle implements Shape {

        public double calculateArea(double[] sides) {
                double halfPerimeter = getHalfPerimeter(sides);
                double sideA = sides[0];
                double sideB = sides[1];
                double sideC = sides[2];
                double area = 0;
                area = Math.sqrt(halfPerimeter*(halfPerimeter-sideA)*(halfPerimeter-sideB)*(halfPerimeter-sideC));
                return area;
        }

        private double getHalfPerimeter(double[] sides) {
                return (sides[0]+sides[1]+sides[2])/2;
        }
}

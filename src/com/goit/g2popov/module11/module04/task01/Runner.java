package com.goit.g2popov.module11.module04.task01;

/**
 * Created by Андрей on 29.05.2016.
 */
public class Runner {
        public static void main (String[] args) {
                Triangle myTriangle = new Triangle();
                double[] sides={2.8d, 6.0d, 4.1d};
                double x = myTriangle.calculateArea(sides);
                System.out.println("Area of a triangle = "+x);
                Rectangle myRectangle = new Rectangle();
                double[] sides2={2.0d, 4.0d};
                double x2 = myRectangle.calculateArea(sides2);
                System.out.println("Area of a rectangle = "+x2);
                Circle myCircle = new Circle();
                double[] sides3={2.0d};
                double x3 = myCircle.calculateArea(sides3);
                System.out.println("Area of a circle = "+x3);
        }
}

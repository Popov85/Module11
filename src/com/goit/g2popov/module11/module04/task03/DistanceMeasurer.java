package com.goit.g2popov.module11.module04.task03;

/**
 * Created by Андрей on 30.05.2016.
 */
public class DistanceMeasurer {
        private double x1;
        private double x2;
        private double y1;
        private double y2;

        public DistanceMeasurer(double x1, double x2, double y1, double y2) {
                this.x1=x1;
                this.x2=x2;
                this.y1=y1;
                this.y2=y2;
        }

        public double measureDistance() {
                double distance;
                double x = this.x2-this.x1;
                double y = this.y2-this.y1;
                distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
                return distance;
        }
}

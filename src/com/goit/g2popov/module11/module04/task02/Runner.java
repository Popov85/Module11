package com.goit.g2popov.module11.module04.task02;

/**
 * Created by Андрей on 30.05.2016.
 */
public class Runner {
        public static void main(String[] args) {
                TemperatureConverter temperature = new TemperatureConverter();
                double temperatureC = temperature.convertIntoCelsius(68);
                System.out.println(temperatureC);
                double temperatureF = temperature.convertIntoFahrenheit(300);
                System.out.println(temperatureF);

        }
}

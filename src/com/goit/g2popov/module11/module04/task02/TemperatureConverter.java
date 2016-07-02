package com.goit.g2popov.module11.module04.task02;

/**
 * Created by Андрей on 30.05.2016.
 */
public class TemperatureConverter {

        public double convertIntoCelsius (double temperatureInFahrenheit) {
                return (temperatureInFahrenheit-32)/1.8;
        }

        public double convertIntoFahrenheit (double temperatureInCelsius) {
                return temperatureInCelsius*9/5+32;
        }
}

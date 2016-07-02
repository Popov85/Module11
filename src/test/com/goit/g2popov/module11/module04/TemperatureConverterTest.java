package test.com.goit.g2popov.module11.module04;

import com.goit.g2popov.module11.module04.task02.TemperatureConverter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Андрей on 30.06.2016.
 */
public class TemperatureConverterTest {

        private static TemperatureConverter converter;


        @BeforeClass
        public static void setUpClass() throws Exception {
                converter = new TemperatureConverter();
        }

        @AfterClass
        public void tearDownClass() throws Exception {
                converter = null;
        }

        @Test
        public void convertIntoCelsius() throws Exception {
                final double temperatureInFahrenheit = 68;
                final double temperatureInCelsius = converter.convertIntoCelsius(temperatureInFahrenheit);
                assertEquals(20, temperatureInCelsius, 0.001);
        }

        @Test
        public void convertIntoFahrenheit() throws Exception {
                final double temperatureInCelsius = 300;
                final double temperatureInFahrenheit = converter.convertIntoFahrenheit(temperatureInCelsius);
                assertEquals(572, temperatureInFahrenheit, 0.001);
        }

}
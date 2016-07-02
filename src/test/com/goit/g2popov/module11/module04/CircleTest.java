package test.com.goit.g2popov.module11.module04;

import com.goit.g2popov.module11.module04.task01.Circle;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Андрей on 30.06.2016.
 */
public class CircleTest {

        private Circle myCircle;

        @Before
        public void setUp() throws Exception {
                myCircle = new Circle();
        }

        @After
        public void tearDown() throws Exception {
                myCircle = null;
        }

        @Test
        public void calculateArea() throws Exception {
                double radius = 8.5d;
                double[] sides={radius};
                final double area = myCircle.calculateArea(sides);
                assertEquals(Math.PI*Math.pow(radius,2), area, 0.001);
        }

}
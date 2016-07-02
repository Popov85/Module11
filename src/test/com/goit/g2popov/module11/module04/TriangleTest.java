package test.com.goit.g2popov.module11.module04;

import com.goit.g2popov.module11.module04.task01.Triangle;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Андрей on 30.06.2016.
 */
public class TriangleTest {

        private Triangle myTriangle;

        @Before
        public void setUp() throws Exception {
                myTriangle = new Triangle();
        }

        @After
        public void tearDown() throws Exception {
                myTriangle = null;
        }

        @Test
        public void calculateArea() throws Exception {
                double[] sides={2.0d, 4.0d, 4.47d};
                final double area = myTriangle.calculateArea(sides);
                Assert.assertEquals(3.999, area, 0.001);

                double[] sides2={2.8d, 6.0d, 4.1d};
                final double area2 = myTriangle.calculateArea(sides2);
                Assert.assertEquals(4.989, area2, 0.001);
        }
}
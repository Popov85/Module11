package test.com.goit.g2popov.module11.module04;

import com.goit.g2popov.module11.module04.task01.Rectangle;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Андрей on 30.06.2016.
 */
public class RectangleTest {

        private Rectangle myRectangle;

        @Before
        public void setUp() throws Exception {
                myRectangle = new Rectangle();
        }

        @After
        public void tearDown() throws Exception {
                myRectangle = null;
        }

        @Test
        public void calculateArea() throws Exception {
                double sideA = 5.5d;
                double sideB = 7.3d;
                double[] sides={sideA, sideB};
                final double area = myRectangle.calculateArea(sides);
                assertEquals(sideA*sideB, area, 0.001);
        }
}
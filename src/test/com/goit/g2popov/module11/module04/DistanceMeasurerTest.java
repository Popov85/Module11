package test.com.goit.g2popov.module11.module04;

import com.goit.g2popov.module11.module04.task03.DistanceMeasurer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Андрей on 30.06.2016.
 */
public class DistanceMeasurerTest {

        @Test
        public void measureDistance() throws Exception {
                final double x1 = 4.4;
                final double x2 = 3.4;
                final double y1 = 6.4;
                final double y2 = 9.9;
                DistanceMeasurer ruler = new DistanceMeasurer(x1,x2,y1,y2);
                assertEquals(3.640, ruler.measureDistance(), 0.001);
        }

}
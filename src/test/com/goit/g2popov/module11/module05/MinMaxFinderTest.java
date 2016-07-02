package test.com.goit.g2popov.module11.module05;

import com.goit.g2popov.module11.module05.task01.MinMaxFinder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Андрей on 02.07.2016.
 */
public class MinMaxFinderTest {

        private MinMaxFinder minMaxInstance;

        @Before
        public void setUp() throws Exception {
                int specimen[] = {5,-9,26,14,-1,7,0,42,6,-8,15,0,19};
                minMaxInstance = new MinMaxFinder(specimen);
        }

        @After
        public void tearDown() throws Exception {
                minMaxInstance = null;
        }

        @Test
        public void getMinimalNumber() throws Exception {
                assertEquals(-9,minMaxInstance.getMinimalNumber());
        }

        @Test
        public void getMaximalNumber() throws Exception {
                assertEquals(42,minMaxInstance.getMaximalNumber());
        }

}
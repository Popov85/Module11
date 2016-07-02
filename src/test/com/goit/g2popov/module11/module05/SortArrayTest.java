package test.com.goit.g2popov.module11.module05;

import com.goit.g2popov.module11.module05.task02.SortArray;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by Андрей on 02.07.2016.
 */

public class SortArrayTest {

        private int specimenResult[] = new int [13];

        private static int specimenExpected[] = {5,-9,26,14,-1,7,0,42,6,-8,15,0,19};
        private static int specimenExpectedTree[] = {5,-9,26,14,-1,7,0,42,6,-8,15,0,19};

        SortArray arrayInstance;

        @Before
        public void setUp() throws Exception {
                int arr[] = {5,-9,26,14,-1,7,0,42,6,-8,15,0,19};
                specimenResult =arr;
                arrayInstance = new SortArray(specimenResult);
        }

        @After
        public void tearDown() throws Exception {
                arrayInstance = null;
        }

        @Test
        public void sortArray() throws Exception {
                arrayInstance.sortArray();
                Arrays.sort(specimenExpected);
                Assert.assertArrayEquals(specimenExpected,arrayInstance.getAnArray());
        }

        @Test
        public void sortArrayBinaryTree() throws Exception {
                arrayInstance.sortArrayBinaryTree();
                Arrays.sort(specimenExpectedTree);
                assertTrue(Arrays.equals(specimenExpectedTree,arrayInstance.getAnArray()));
        }
}
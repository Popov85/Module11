package test.com.goit.g2popov.module11.module09_10;

import com.goit.g2popov.module11.module10.FileCipher;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertTrue;

/**
 * Created by Андрей on 02.07.2016.
 */
public class FileCipherTest {

        private static final String PATH_WAY_EXPECTED = "C:\\ExpectedFile.txt";
        private static final String PATH_WAY_ACTUAL = "D:\\ActualFile.txt";
        private FileCipher cipher;

        /**
         * Compares two files located according to PATH_WAYs
         * Coded sequence is: {Fox, Wolf, Bull, Hare}
         * You should get the following: {Ira, Zroi, Exoo, Kduh}
         * @throws Exception
         */
        @Test (timeout=5000)
        public void writeByLineCoded() throws Exception {
                File fileExpected = new File(PATH_WAY_EXPECTED);
                File fileActual = new File(PATH_WAY_ACTUAL);
                assertTrue("The files differ!", FileUtils.contentEquals(fileExpected, fileActual));
        }
}
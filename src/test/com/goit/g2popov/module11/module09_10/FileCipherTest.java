package test.com.goit.g2popov.module11.module09_10;

import com.goit.g2popov.module11.module10.FileCipher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Андрей on 02.07.2016.
 */
public class FileCipherTest {

        private static final String PATH_WAY = "C:\\SampleFile.txt";
        private FileCipher cipher;

        @Before
        public void setUp() throws Exception {
                cipher = new FileCipher(PATH_WAY);
        }

        @After
        public void tearDown() throws Exception {

        }

        /**
         * Enter one by one {Fox, Wolf, Bull, Hare}
         * You should get the following: {Ira, Zroi, Exoo, Kduh}
         *
         * @throws Exception
         */
        @Test
        public void writeByLineCoded() {
                final String[] content = {"Ira", "Zroi", "Exoo", "Kduh"};
                Scanner scanner = null;
                int counter;
                try {
                        scanner = new Scanner(new BufferedReader(new FileReader(PATH_WAY)));
                        counter = 0;
                        while (scanner.hasNextLine()) {
                                assertEquals(content[counter++], scanner.nextLine());
                        }
                } catch (FileNotFoundException e) {
                        System.out.println("Failed to open a file according to the pathway given!");
                } finally {
                        if (scanner != null) scanner.close();
                }
        }


        @Test
        public void readByLineDecoded() throws Exception {
                final String[] content = {"Fox", "", "Exoo", "Kduh"};


        }

}
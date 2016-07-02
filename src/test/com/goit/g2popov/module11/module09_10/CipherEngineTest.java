package test.com.goit.g2popov.module11.module09_10;

import com.goit.g2popov.module11.module10.CipherEngine;
import org.junit.After;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Андрей on 02.07.2016.
 */
public class CipherEngineTest {

        private static final String STATEMENT = "The quick brown fox jumps over the lazy dog";
        private static final String STATEMENT_CODED = "Ymj vznhp gwtbs ktc ozrux tajw ymj qfed itl";

        private CipherEngine engine = new CipherEngine("",5);

        @After
        public void tearDown() throws Exception {
                engine = null;
        }

        @Test
        public void cipher() throws Exception {
                String expectedString = STATEMENT_CODED;
                engine.setStatement(STATEMENT);
                assertEquals(expectedString, engine.cipher());
        }

        @Test
        public void decipher() throws Exception {
                String expectedString = STATEMENT;
                engine.setStatement(STATEMENT_CODED);
                assertEquals(expectedString, engine.decipher());
        }
}
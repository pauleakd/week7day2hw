package example.codeclan.com.countingwords;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by paulevaris on 18/04/2017.
 */

public class WordsTest {

    @Test

    public void testSetUp(){
        Words words = new Words("Hi I am Paule");
        assertEquals("Hi", words.getWordList().get(0));
        assertEquals(4, words.getWordList().size());

    }
}



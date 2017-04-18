package example.codeclan.com.countingwords;

import org.junit.Test;

import java.util.HashMap;

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

    @Test

    public void testCountsinHash(){
        Words words = new Words("hi hi I am Paule");
        HashMap hashed_words = words.countInHash();
        System.out.print(hashed_words.toString());
        assertEquals(2, hashed_words.get("hi"));


    }
    @Test
    public void testCountsinHash2(){
        Words words = new Words("it was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity");
        HashMap hashed_words = words.countInHash();
        System.out.print(hashed_words.toString());
        assertEquals(6, hashed_words.get("it"));


    }
}



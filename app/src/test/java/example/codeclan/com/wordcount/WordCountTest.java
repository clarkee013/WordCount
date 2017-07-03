package example.codeclan.com.wordcount;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/07/2017.
 */

public class WordCountTest {

        private WordCount wordCount;

    @Before
    public void before(){
        wordCount = new WordCount();
    }

    @Test
    public void canGetSentence(){
        assertEquals("Hello there", WordCount.getSentence());
    }

}

package com.tutorial.project.one;

import com.tutorial.program.one.WordCount;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTest {

    @Test
    public void testWordCount(){
        WordCount wordCount = new WordCount();
        String sentence = "This is test sentence";
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("this", 1);
        testMap.put("is", 1);
        testMap.put("test", 1);
        testMap.put("sentence", 1);
        assert(wordCount.wordCount(sentence)).equals(testMap);
    }

}

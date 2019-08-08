package com.tutorial.program.one;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public Map<String, Integer> wordCount(String sentence){

        Map<String, Integer> wordCount = new HashMap<>();

        String[] words = sentence.split(" ");
        Arrays.stream(words).forEach(word -> {
            String lowerCaseWord = word.toLowerCase();
            if (wordCount.containsKey(lowerCaseWord)){
                wordCount.put(lowerCaseWord, (wordCount.get(lowerCaseWord) + 1));
            } else {
                wordCount.put(lowerCaseWord, 1);
            }
        });

        return  wordCount;

    }

}

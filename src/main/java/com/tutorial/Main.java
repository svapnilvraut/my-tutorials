package com.tutorial;

import com.tutorial.program.one.WordCount;

public class Main {

    public static void main(String[] args) {
        WordCount wordCount = new WordCount();
        String sentence = "is this This tHis thIs thiS";
        System.out.println(wordCount.wordCount(sentence));
    }
}

package com.stormbreakers.shinybackend.service;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@Component
public class DictionaryService {
    private List<String> dictionary;

    public DictionaryService() {
        dictionary = new LinkedList<>();
    }

    public int getDictionarySize() {
        return dictionary.size();
    }

    public boolean addWord(String newValue) {
        return dictionary.contains(newValue) && dictionary.add(newValue);
    }

    public String getRandomWord() {
        return dictionary.get(new Random().nextInt(dictionary.size()));
    }
}
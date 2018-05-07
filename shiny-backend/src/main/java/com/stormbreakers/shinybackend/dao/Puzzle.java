package com.stormbreakers.shinybackend.dao;

public class Puzzle {
    private long id = 0;
    private String sentence = "[Test] Sentence";
    private String wordIdentifier = "[Test]";
    private String options = "cool,weird,correct,test";
    private int correctionOptionIndex = 3;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getWordIdentifier() {
        return wordIdentifier;
    }

    public void setWordIdentifier(String wordIdentifier) {
        this.wordIdentifier = wordIdentifier;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public int getCorrectionOptionIndex() {
        return correctionOptionIndex;
    }

    public void setCorrectionOptionIndex(int correctionOptionIndex) {
        this.correctionOptionIndex = correctionOptionIndex;
    }
}
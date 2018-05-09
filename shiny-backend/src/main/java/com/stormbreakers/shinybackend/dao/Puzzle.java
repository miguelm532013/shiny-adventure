package com.stormbreakers.shinybackend.dao;

public class Puzzle {
    private Integer id = 0;
    private String sentence = "[Test] Sentence";
    private String options = "cool,weird,correct,test";
    private Integer correctionOptionIndex = 3;
    private String quoteLink;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public Integer getCorrectionOptionIndex() {
        return correctionOptionIndex;
    }

    public void setCorrectionOptionIndex(Integer correctionOptionIndex) {
        this.correctionOptionIndex = correctionOptionIndex;
    }

    public void setQuoteLink(String quoteLink) {
        this.quoteLink = quoteLink;
    }
}
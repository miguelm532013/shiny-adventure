package com.stormbreakers.shinybackend.dao;

public class Quote {
    private String quoteText = "The first requisite for success is the ability to apply your physical and mental energies to one problem incessantly without growing weary. ";
    private String quoteAuthor = "Thomas Edison";
    private String senderName = "";
    private String quoteLink = ""; // create a short checksum to use this as a key in the future?

    public String getQuoteText() {
        return quoteText;
    }

    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }

    public String getQuoteAuthor() {
        return quoteAuthor;
    }

    public void setQuoteAuthor(String quoteAuthor) {
        this.quoteAuthor = quoteAuthor;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getQuoteLink() {
        return quoteLink;
    }

    public void setQuoteLink(String quoteLink) {
        this.quoteLink = quoteLink;
    }
}

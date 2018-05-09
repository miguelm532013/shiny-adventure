package com.stormbreakers.shinybackend.service;

import com.stormbreakers.shinybackend.dao.Puzzle;
import com.stormbreakers.shinybackend.dao.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PuzzleGeneratorService {

    @Autowired
    private QuoteService quoteService;

    @Autowired
    private DictionaryService dictionaryService;

    public Puzzle generatePuzzle() {
        Puzzle generatedPuzzle = new Puzzle();
        Random random = new Random();

        Quote randomQuote = quoteService.getRandomQuote();
        String quoteLink = randomQuote.getQuoteLink();
        String quoteText = randomQuote.getQuoteText();
        String quoteAuthor = randomQuote.getQuoteAuthor();
        String incorrectAuthor1 = "test1";//dictionaryService.getRandomWord();
        String incorrectAuthor2 = "test2";//dictionaryService.getRandomWord();
        while (!incorrectAuthor1.equalsIgnoreCase(incorrectAuthor2) && dictionaryService.getDictionarySize() > 1) {
            incorrectAuthor2 = dictionaryService.getRandomWord();
        }
        int correctIndex = random.nextInt(3);

        generatedPuzzle.setId(random.nextInt());
        if (generatedPuzzle.getId() < 0) {
            generatePuzzle().setId(generatedPuzzle.getId()*-1);
        }
        generatedPuzzle.setSentence(quoteText);
        generatedPuzzle.setOptions(shuffle(quoteAuthor, incorrectAuthor1, incorrectAuthor2, correctIndex));
        generatedPuzzle.setCorrectionOptionIndex(correctIndex);
        generatedPuzzle.setQuoteLink(quoteLink);

        return generatedPuzzle;
    }

    /**
     * Shuffles three strings into a semi-random order. The end result will be a comma seperated string
     * containing the correct answer in the specified correct index.
     */
    public String shuffle(String correctOption, String invalidOption1, String invalidOption2, int correctIndex) {
        return correctOption+","+invalidOption1+","+invalidOption2;
    }
}

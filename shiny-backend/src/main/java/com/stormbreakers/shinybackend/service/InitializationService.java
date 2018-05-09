package com.stormbreakers.shinybackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InitializationService {

    @Autowired
    private PuzzleGeneratorService puzzleGeneratorService;

    @Autowired
    private QuoteService quoteService;

    @Autowired
    private DictionaryService dictionaryService;

    /**
     * This is a temporary method.
     *
     * Since all data is being stored in non persisting storage the application needs to have enough
     * puzzles to function. This applications populates the puzzles.
     */
    public void initializePuzzles() {
        //populate quotes
        //quoteService.downloadNewQuote();
        //quoteService.downloadNewQuote();
        //quoteService.downloadNewQuote();
        //populate puzzles
        puzzleGeneratorService.generatePuzzle();
        puzzleGeneratorService.generatePuzzle();
        puzzleGeneratorService.generatePuzzle();
    }
}

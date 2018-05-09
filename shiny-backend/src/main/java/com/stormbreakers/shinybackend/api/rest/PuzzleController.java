package com.stormbreakers.shinybackend.api.rest;

import com.stormbreakers.shinybackend.dao.Puzzle;
import com.stormbreakers.shinybackend.service.GameService;
import com.stormbreakers.shinybackend.service.PuzzleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PuzzleController {

    @Autowired
    private PuzzleService puzzleService;

    @Autowired
    private GameService gameService;

    @GetMapping(path = "/testPuzzle")
    public Puzzle getRandomPuzzle() {
        return puzzleService.getRandomPuzzle();

    }

    @GetMapping(path = "/puzzle")
    public Puzzle getPuzzleForGame(Integer gameId) {
        gameService.retrieveGame(gameId);
        return puzzleService.getRandomPuzzle();
    }
}
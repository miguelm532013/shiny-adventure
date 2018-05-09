package com.stormbreakers.shinybackend.service;

import com.stormbreakers.shinybackend.dao.Puzzle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class PuzzleService {
    @Autowired
    private PuzzleGeneratorService puzzleGeneratorService;
    private List<Puzzle> puzzles;

    public PuzzleService() {
        puzzles = new LinkedList<>();
        puzzles.add(new Puzzle());
    }

    // TODO: Prevent sessions from getting the same two puzzles
    public Puzzle getRandomPuzzle() {
        return puzzleGeneratorService.generatePuzzle();
        //return puzzles.get(new Random().nextInt(puzzles.size()));
    }

}

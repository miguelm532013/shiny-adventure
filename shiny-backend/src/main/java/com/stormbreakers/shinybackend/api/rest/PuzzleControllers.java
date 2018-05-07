package com.stormbreakers.shinybackend.api.rest;

import com.stormbreakers.shinybackend.dao.Puzzle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PuzzleControllers {

    @GetMapping(path = "/puzzle")
    public Puzzle getRandomPuzzle() {
        return new Puzzle();
    }
}

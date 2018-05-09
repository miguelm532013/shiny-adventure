package com.stormbreakers.shinybackend.api.rest;

import com.stormbreakers.shinybackend.dao.Game;
import com.stormbreakers.shinybackend.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(path = "/game")
    public Game getNewGame() {
        return gameService.createNewGame();
    }
}

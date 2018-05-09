package com.stormbreakers.shinybackend.service;

import com.stormbreakers.shinybackend.dao.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class GameService {
    @Autowired
    private PuzzleGeneratorService puzzleGeneratorService;

    private Map<Integer, Game> activeGames;

    public GameService() {
        this.activeGames = new HashMap<>();
    }

    public Game createNewGame() {
        Game createdGame = new Game();
        createdGame.setId(activeGames.size());
        activeGames.put(createdGame.getId(), createdGame);

        return createdGame;
    }

    public Game retrieveGame(Integer gameId) {
        return activeGames.get(gameId);
    }
}

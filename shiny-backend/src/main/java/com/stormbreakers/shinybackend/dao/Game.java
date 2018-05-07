package com.stormbreakers.shinybackend.dao;

import java.util.List;

public class Game {
    private long id;
    private int numberOfGamesPlayed;
    private int numberOfGamesWon;
    private List<Integer> puzzlesPlayed;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumberOfGamesPlayed() {
        return numberOfGamesPlayed;
    }

    public void setNumberOfGamesPlayed(int numberOfGamesPlayed) {
        this.numberOfGamesPlayed = numberOfGamesPlayed;
    }

    public int getNumberOfGamesWon() {
        return numberOfGamesWon;
    }

    public void setNumberOfGamesWon(int numberOfGamesWon) {
        this.numberOfGamesWon = numberOfGamesWon;
    }

    public List<Integer> getPuzzlesPlayed() {
        return puzzlesPlayed;
    }

    public void setPuzzlesPlayed(List<Integer> puzzlesPlayed) {
        this.puzzlesPlayed = puzzlesPlayed;
    }
}

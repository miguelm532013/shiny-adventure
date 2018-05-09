package com.stormbreakers.shinybackend.dao;

import java.util.LinkedList;
import java.util.List;

public class Game {
    private Integer id;
    private Integer numberOfGamesPlayed;
    private Integer numberOfGamesWon;
    private List<Integer> puzzlesPlayed;

    public Game() {
        numberOfGamesPlayed = 0;
        numberOfGamesWon = 0;
        puzzlesPlayed = new LinkedList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumberOfGamesPlayed() {
        return numberOfGamesPlayed;
    }

    public void setNumberOfGamesPlayed(Integer numberOfGamesPlayed) {
        this.numberOfGamesPlayed = numberOfGamesPlayed;
    }

    public Integer getNumberOfGamesWon() {
        return numberOfGamesWon;
    }

    public void setNumberOfGamesWon(Integer numberOfGamesWon) {
        this.numberOfGamesWon = numberOfGamesWon;
    }

    public List<Integer> getPuzzlesPlayed() {
        return puzzlesPlayed;
    }

    public void setPuzzlesPlayed(List<Integer> puzzlesPlayed) {
        this.puzzlesPlayed = puzzlesPlayed;
    }
}

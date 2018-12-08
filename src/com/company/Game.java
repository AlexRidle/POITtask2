package com.company;

public class Game {
    public void start(){
        Field game = new Field();
        game.generate();
        while(Queen.hasMove) {
            Queen.placeQueen(game);
        }
        game.showGridView();
    }
}

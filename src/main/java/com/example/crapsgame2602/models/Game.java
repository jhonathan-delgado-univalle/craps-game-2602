package com.example.crapsgame2602.models;

public class Game {

    private Player player;
    private Dice dice1;
    private Dice dice2;

    public Game(Player p) {
        player = p;
        dice1 = new Dice();
        dice2 = new Dice();
    }

    public int diceRolls() {
        int dice1_value = dice1.roll();
        int dice2_value = dice2.roll();
        return dice1_value + dice2_value;
    }

    public String getDiceImagePath(int dice) {
        if (dice == 1) {
            return dice1.getImagePath();
        } else {
            return dice2.getImagePath();
        }
    }

}

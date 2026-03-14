package com.example.crapsgame2602.models;

public class Dice {
    private int value;

    public int roll() {
        value = (int) (Math.random()*6) + 1;
        return value;
    }

    public String getImagePath() {
        return "/com/example/crapsgame2602/images/dices/dice" +  value + ".png";
    }
}

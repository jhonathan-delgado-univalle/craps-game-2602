package com.example.crapsgame2602.controllers;

import com.example.crapsgame2602.models.Game;
import com.example.crapsgame2602.models.Player;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;

public class GameController {

    @FXML
    private VBox vBoxGameZone;

    @FXML
    private ImageView dice1ImageView, dice2ImageView;

    @FXML
    private TextArea summaryTextArea;

    private boolean dado = true;

    private Player currentPlayer;
    private Game game;

    @FXML
    Label playerNameLabel;

    public void setCurrentPlayer(Player p){
        currentPlayer = p;
        game = new Game(currentPlayer);
        playerNameLabel.setText(currentPlayer.getName());
    }

    @FXML
    public void onActionPlayButton(ActionEvent event){
        int drop = game.diceRolls();
        String dice1ImagePath = game.getDiceImagePath(1);
        String dice2ImagePath = game.getDiceImagePath(2);

        dice1ImageView.setImage(new Image(
                getClass().getResourceAsStream(dice1ImagePath)
        ));
        dice2ImageView.setImage(new Image(
                getClass().getResourceAsStream(dice2ImagePath)
        ));
    }
}

package com.example.crapsgame2602.controllers;

import com.example.crapsgame2602.models.Player;
import com.example.crapsgame2602.views.GameView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeController {

    @FXML
    private TextField playerNameTextField;

    @FXML
    private Label welcomeText;

    @FXML
    void onActionPlayButton(ActionEvent event) {
        String playerName = playerNameTextField.getText();
        Player player = new Player();
        player.setName(playerName);

        GameView gameView;
        try {
            gameView = GameView.getInstance();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        GameController gameController = gameView.getController();
        gameController.setCurrentPlayer(player);
        gameView.show();
        // ((Node) event.getSource()).getScene().getWindow().hide();
        playerNameTextField.getScene().getWindow().hide();

    }

}

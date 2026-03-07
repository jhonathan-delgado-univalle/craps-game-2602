package com.example.crapsgame2602.controllers;

import com.example.crapsgame2602.models.AlertBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
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
    private ImageView dice1ImageView;

    @FXML
    private TextArea summaryTextArea;

    private boolean dado = true;

    @FXML
    public void onActionPlayButton(ActionEvent event){
        String summary = summaryTextArea.getText();
        // new AlertBox().showAlertBox("Saludo", "FPOE Gr02", "Hola " + summary);
        if (dado){
            dice1ImageView.setImage(new Image(
                getClass().getResourceAsStream("/com/example/crapsgame2602/images/dado_5.png")
                ));
        } else {
            dice1ImageView.setImage(new Image(
                    getClass().getResourceAsStream("/com/example/crapsgame2602/images/dado_6.png")
            ));
        }
        dado = !dado;
        TextField textField = new TextField();
        textField.setOnKeyTyped(
                new EventHandler<KeyEvent>() {
                    @Override
                    public void handle(KeyEvent keyEvent) {
                        System.out.println(keyEvent.getTarget() + " : " + keyEvent.getCharacter());
                    }
                }
        );
        vBoxGameZone.getChildren().add(textField);
    }

    @FXML
    void onKeyTypedSummaryTextArea(KeyEvent event) {
        System.out.println("Character: " + event.getCharacter());

    }
}

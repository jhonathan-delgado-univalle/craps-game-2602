package com.example.crapsgame2602;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("game-view.fxml"));
        Parent root = fxmlLoader.load();

        /*
        VBox root = new VBox();
        Label infoLabel = new Label("Clic here");
        Button helloButton = new Button("Saludar");
        root.getChildren().add(infoLabel);
        root.getChildren().add(helloButton);
        */

        Scene scene = new Scene(root);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}

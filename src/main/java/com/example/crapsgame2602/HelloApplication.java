package com.example.crapsgame2602;

import com.example.crapsgame2602.models.AlertBox;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("game-view.fxml")
        );
        Parent root = fxmlLoader.load();

        /*
        VBox root = new VBox();
        Label infoLabel = new Label("Clic here");
        Button helloButton = new Button("Saludar");
        root.getChildren().add(infoLabel);
        root.getChildren().add(helloButton);

        helloButton.setOnMouseClicked(
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        // AlertBox alertBox = new AlertBox();
                        // alertBox.showAlertBox("Saludo", "FPOE Gr02", "Hola estudiantes!");
                        System.out.println("## Button Handle ##");
                        System.out.println("Source: " + mouseEvent.getSource());
                        System.out.println("Target: " + mouseEvent.getTarget());
                        System.out.println("## Button Handle ##");
                    }
                }
        );

        root.setOnMouseClicked(
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        System.out.println("## VBox Handle ##");
                        System.out.println("Source: " + mouseEvent.getSource());
                        System.out.println("Target: " + mouseEvent.getTarget());
                        System.out.println("## VBox Handle ##");
                    }
                }
        );
        */

        Scene scene = new Scene(root);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}

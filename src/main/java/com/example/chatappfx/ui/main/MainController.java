package com.example.chatappfx.ui.main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private ScrollPane chatScrollPane;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        final VBox chatContainer = new VBox();
        chatContainer.setAlignment(Pos.CENTER);
        final Button chatButton = new Button("Chat");
        chatButton.setStyle("-fx-background-radius: 30px");


        chatContainer.getChildren().add(chatButton);

        this.chatScrollPane.setContent(chatContainer);
    }
}
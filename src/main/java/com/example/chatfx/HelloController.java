package com.example.chatfx;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ImageView action;

    @FXML
    private TextField textField;

    @FXML
    private AnchorPane pane;

    private void createNewLabel(){
        Label txt = new Label(textField.getText());
        txt.setLayoutX(10);
        txt.setLayoutY(i);
        i += 35;
        txt.setPrefHeight(20);
        txt.setStyle("-fx-background-color: cornflowerblue;-fx-border-radius: 10;-fx-background-radius: 10;-fx-font-size: 20;");
        pane.getChildren().add(txt);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        action.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                createNewLabel();
                textField.clear();
            }
        });
    }

    public int i = 100;
}
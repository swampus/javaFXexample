package com.sda.j7.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button theButton;

    @FXML
    void initialize() {
        System.out.println("initialize");
        theButton.setOnMouseClicked(t-> {
            System.out.println("The Button Clicked");
        });
    }
}

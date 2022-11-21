package com.example.project4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class MainController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private RadioButton chicagoStyleButton;

    @FXML
    private RadioButton nyStyleButton;

    public void chicagoButtonClick(){
        //go to chicagostyle view

    }
}
package com.example.project4;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    private Button chicagoStyle;
    @FXML
    private Button nyStyle;

    @FXML
    private Button currOrderButton;

    @FXML
    private Button storeOrderButton;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void chicagoStyleClick() throws IOException {
        //open new window to chicago style view
        Parent root = FXMLLoader.load(getClass().getResource("ChicagoStyle-view.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Chicago Pizza");
        primaryStage.setScene(scene);
        primaryStage.initModality(Modality.NONE);
        primaryStage.show();
    }

    @FXML
    public void nyStyleClick() throws IOException {
        //open new window to ny style view
        Parent root = FXMLLoader.load(getClass().getResource("NewYorkStyle-view.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("NY Pizza");
        primaryStage.setScene(scene);
        primaryStage.initModality(Modality.NONE);
        primaryStage.show();
    }

    @FXML
    public void currOrderClick() throws IOException {
        //open new window to current order view
        Parent root = FXMLLoader.load(getClass().getResource("CurrentOrder-view.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Current Order");
        primaryStage.setScene(scene);
        primaryStage.initModality(Modality.NONE);
        primaryStage.show();
    }

    @FXML
    public void storeOrderClick() throws IOException {
        //open new window to store order view
        Parent root = FXMLLoader.load(getClass().getResource("StoreOrders-view.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Store Orders");
        primaryStage.setScene(scene);
        primaryStage.initModality(Modality.NONE);
        primaryStage.show();
    }
}
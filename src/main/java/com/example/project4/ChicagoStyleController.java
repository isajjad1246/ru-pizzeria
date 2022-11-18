package com.example.project4;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.net.URL;

public class ChicagoStyleController{

    @FXML
    ObservableList<String> flavors = FXCollections.observableArrayList("Deluxe", "BBQ Chicken", "Meatzza", "Build Your Own");
    ListView pizzaFlavors = new ListView ();
//    pizzaFlavors.getItems().add()


}

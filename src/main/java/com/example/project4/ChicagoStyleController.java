package com.example.project4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class ChicagoStyleController implements Intializable{

    @FXML
    private ComboBox<String> addToppings1 = new ComboBox <String> ();

    @FXML
    private ComboBox<String> flavorBox1 = new ComboBox <String> ();

    @FXML
    private ImageView imageView1;

    @FXML
    private ComboBox<String> sizeBox1 = new ComboBox <String> ();

    @FXML
    private ComboBox<String> toppingsBox1 = new ComboBox <String> ();

    @FXML
    private TextArea totalBox1;


    @FXML
    void selectFlavor(ActionEvent event) {
        String flavorString = flavorBox1.getSelectionModel().getSelectedItem().toString();

    }

    @FXML
    void selectSize(ActionEvent event){
        String sizeString = sizeBox1.getSelectionModel().getSelectedItem().toString();
    }


    @Override
    public void initialize(URL url, ResourceBundle rb){
        ObservableList<String> flavorList= FXCollections.observableArrayList("Deluxe", "BBQ", "Meatzza", "Build Your Own");
        flavorBox1.setItems(flavorList);

        ObservableList<String> size = FXCollections.observableArrayList("small", "medium", "large");
        sizeBox1.setItems(size);
    }


}
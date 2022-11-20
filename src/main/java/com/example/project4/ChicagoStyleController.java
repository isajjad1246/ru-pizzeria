package com.example.project4;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ChicagoStyleController {

    @FXML
    private ComboBox<String> addToppings1;

    @FXML
    private ComboBox<String> flavorBox1;

    @FXML
    private ImageView imageView1;

    @FXML
    private ComboBox<String> sizeBox1;

    @FXML
    private ComboBox<String> toppingsBox1;

    @FXML
    private TextArea totalBox1;


    @FXML
    void selectFlavor(MouseEvent event) {
       // flavorBox1.setItems(FXCollections.observableArrayList("Deluxe", "BBQ Chicken", "Meatzza", "Build Your Own"));
        flavorBox1.getItems().add("whatever");
//        flavorBox1.getItems().addAll(){
//                    "Deluxe",
//                    "BBQ Chicken",
//                    "Meatzza",
//                    "Build Your Own"
//        }



    }

    @FXML
    void selectMoreToppings(ActionEvent event) {

    }

    @FXML
    void selectSize(ActionEvent event) {

    }

    @FXML
    void selectToppings(ActionEvent event) {

    }

}

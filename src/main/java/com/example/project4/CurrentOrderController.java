package com.example.project4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class CurrentOrderController {

    @FXML
    private TextField orderNum;

    @FXML
    private ListView listViewOrders;

    @FXML
    private TextField subtotal;

    @FXML
    private TextField salesTax;

    @FXML
    private TextField orderTotal;

    @FXML
    private Button removePizza;

    @FXML
    private Button placeOrder;

    @FXML
    private Button clearOrder;

    //methods for actions and stuff
    @FXML
    public void displayOrderNum(){

    }
}

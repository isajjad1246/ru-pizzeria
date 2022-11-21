package com.example.project4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class StoreOrdersController {
    @FXML
    private ComboBox <Integer> orderNumBox;
    @FXML
    public TextField orderTotalTextBox;
    @FXML
    public ListView storeOrderListView;
    @FXML
    public Button cancelOrderButton;
    @FXML
    public Button exportStoreOrdersButton;

    public void orderDropDown(ActionEvent actionEvent) {

    }
}

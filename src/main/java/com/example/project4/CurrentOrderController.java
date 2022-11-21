package com.example.project4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class CurrentOrderController {
    private ChicagoStyleController chicagoStyleController;
    private NewYorkStyleController newYorkStyleController;

    private Order currOrder = new Order();
    private ObservableList<Pizza> pizzaList = FXCollections.observableArrayList();

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


    //every time pizza is set to order, this is called and updated
    @FXML
    public void display(){
        orderNum.setText(String.valueOf(currOrder.orderNumber));
        listViewOrders.setItems((ObservableList) currOrder.pizzaOrder);
        subtotal.setText(String.valueOf(currOrder.orderCost));
        salesTax.setText(String.valueOf(currOrder.orderCost*.0625));
        currOrder.orderCost = currOrder.orderCost*1.0625;
        orderTotal.setText(String.valueOf(currOrder.orderCost));

    }

    //button to add order to store orders
    @FXML
    public void addToStoreOrder(){
        //add the order to store order
    }
}

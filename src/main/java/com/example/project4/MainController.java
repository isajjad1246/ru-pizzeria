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

    private Parent root;
    private Stage stage;
    private StoreOrders orders = new StoreOrders();

    private Order order = new Order();
    private double pizzaTotal = 0;

    private MainController mainController; //controller for main view

    private static final double WINDOW_LOCATION = 0;

    public void setMainController(MainController mainController){
        this.mainController = mainController;
    }

    public void addPizzaToOrder(Pizza pizza){
        order.add(pizza);
    }

    public void setCostTotal(double amt){
        this.pizzaTotal = amt;
    }

    public void addingOrders(double amt){
        order.setOrderTotal(amt);
        orders.add(order);
        this.pizzaTotal = 0;
        this.order = new Order();
    }

    public boolean removeOrder(Order removesOrder){
        return this.orders.remove(removesOrder);
    }

    public boolean removeItem(Pizza removesOrder){
        return this.order.remove(removesOrder);

    }

    public StoreOrders getOrders(){
        return this.orders;
    }

    public Order getOrder(){
        return this.order;
    }

    @FXML
    public void chicagoStyleClick() throws IOException {
        //open new window to chicago style view
//        Parent root = FXMLLoader.load(getClass().getResource("ChicagoStyle-view.fxml"));
//        Scene scene = new Scene(root);
//        Stage primaryStage = new Stage();
//        primaryStage.setTitle("Chicago Pizza");
//        primaryStage.setScene(scene);
//        primaryStage.initModality(Modality.NONE);
//        primaryStage.show();
//        root = FXMLLoader.load(getClass().getResource("ChicagoStyle-view.fxml"));
//        stage.setTitle("Chicago Pizza");
        load("ChicagoStyle-view.fxml", "Chicago Pizza");


    }

    @FXML
    public void nyStyleClick() throws IOException {
        //open new window to ny style view
//        Parent root = FXMLLoader.load(getClass().getResource("NewYorkStyle-view.fxml"));
//        Scene scene = new Scene(root);
//        Stage primaryStage = new Stage();
//        primaryStage.setTitle("NY Pizza");
//        primaryStage.setScene(scene);
//        primaryStage.initModality(Modality.NONE);
//        primaryStage.show();
//        root = FXMLLoader.load(getClass().getResource("NewYorkStyle-view.fxml"));
//        stage.setTitle("NY Pizza");
        load("NewYorkStyle-view.fxml", "NY Pizza");

    }

    @FXML
    public void currOrderClick() throws IOException {
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("CurrentOrder-view.fxml"));
//        //open new window to current order view
//        Parent root = loader.load();
////        ChicagoStyleController controller = FXMLLoader.getController();
//        Scene scene = new Scene(root);
//        Stage primaryStage = new Stage();
//        primaryStage.setTitle("Current Order");
//        primaryStage.setScene(scene);
//        primaryStage.initModality(Modality.NONE);
//        primaryStage.show();
//        root = FXMLLoader.load(getClass().getResource("CurrentOrder-view.fxml"));
//        stage.setTitle("Current Order");
        load("CurrentOrder-view.fxml", "Current Order");
    }

    @FXML
    public void storeOrderClick() throws IOException {
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("StoreOrders-view.fxml"));
//        //open new window to store order view
//        Parent root = loader.load();
//        Scene scene = new Scene(root);
//        Stage primaryStage = new Stage();
//        primaryStage.setTitle("Store Orders");
//        primaryStage.setScene(scene);
//        primaryStage.initModality(Modality.NONE);
//        primaryStage.show();

        load("StoreOrders-view.fxml", "Store Order");

    }

    private void load(String fxmlRoot, String stageTitle) throws IOException{
        if(stage != null){
            stage.close();
        }
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlRoot));
        root = (Parent) fxmlLoader.load();
        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setX(WINDOW_LOCATION);
        stage.setY(WINDOW_LOCATION);
        stage.setTitle(stageTitle);
        stage.setScene(new Scene(root));
        if(stageTitle.equals("Chicago Pizza")){
            ChicagoStyleController controller = (ChicagoStyleController) fxmlLoader.getController();
            controller.setMainController(this);
        }
        if(stageTitle.equals("NY Pizza")){
            NewYorkStyleController controller = (NewYorkStyleController) fxmlLoader.getController();
            controller.setMainController(this);
        }
        if(stageTitle.equals("Current Order")){
            CurrentOrderController controller = (CurrentOrderController) fxmlLoader.getController();
            controller.setMainController(this);
        }
        if(stageTitle.equals("Store Order")){
            StoreOrdersController controller = (StoreOrdersController) fxmlLoader.getController();
            controller.setMainController(this);
        }
        stage.show();
    }

    //method to add pizza to order
    public void addPizza(Pizza pizza){
        order.add(pizza);
    }
}
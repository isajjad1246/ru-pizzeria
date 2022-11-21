package com.example.project4;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class ChicagoStyleController implements Intializable{
    @FXML
    private Button addToppings;
    @FXML
    private Button removeToppings;
    PizzaFactory pf = new ChicagoPizza();
    Pizza deluxe = pf.createDeluxe();
    Pizza bbq = pf.createBBQChicken();
    Pizza meatzza = pf.createMeatzza();
    Pizza byo = pf.createBuildYourOwn();


    @FXML
    private ListView <String> toppingsList = new ListView<>();

    @FXML
    private ListView <String> displayToppings = new ListView<>();

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
    private TextArea priceBox;


    @FXML
    void selectFlavor(MouseEvent event) {
        String flavorString = flavorBox1.getSelectionModel().getSelectedItem().toString();

    }

    @FXML
    void selectSize(MouseEvent event){
        String sizeString = sizeBox1.getSelectionModel().getSelectedItem().toString();
    }

//    @FXML
//    void selectToppings(ActionEvent event){
//        String toppingsString = toppingsBox1.getSelectionModel().getSelectedItem().toString();
//
//    }

    @FXML
    void addButton(MouseEvent event){
        if(toppingsList.getItems().size() >= 7){
            ButtonType ButtonType = null;
            Alert alarm = new Alert(Alert.AlertType.ERROR, "cannot exceed 7 toppings!", ButtonType);
            alarm.setHeaderText("This is the maximum number of toppings");
            alarm.show();
        }
        else{
            String availableItem = displayToppings.getSelectionModel().getSelectedItem();
            displayToppings.getItems().remove(availableItem);
            toppingsList.getItems().add(availableItem);
            String result = flavorBox1.getSelectionModel().getSelectedItem();
            if(result.equals("Build Your Own")){
                byo.add(availableItem);
                //byo.setPrice() = byo.price() + 1.49;
                priceBox.setText(Double.toString(byo.price()));
            }
        }
    }

    @FXML
    void removeButton(MouseEvent event){
        String availableItem = toppingsList.getSelectionModel().getSelectedItem();
        toppingsList.getItems().remove(availableItem);
        displayToppings.getItems().add(availableItem);
        String result = flavorBox1.getSelectionModel().getSelectedItem();
        if(result.equals("Build Your Own")){
            byo.remove(availableItem);
            priceBox.setText(Double.toString(byo.price()));
        }
    }

    String[] ChicagoView = {Topping.SAUSAGE.toString(), Topping.PEPPERONI.toString(), Topping.GREEN_PEPPER.toString(), Topping.ONION.toString(), Topping.MUSHROOM.toString(), Topping.BBQ_CHICKEN.toString(), Topping.PROVOLONE.toString(), Topping.CHEDDAR.toString(), Topping.BEEF.toString(), Topping.HAM.toString(), Topping.PINEAPPLE.toString(), Topping.JALAPENO.toString(), Topping.OLIVES.toString()};
    //String currentViewItem;
    Image chicagoDelux = new Image("chicago_deluxe.png");
    Image chicagoBBQ = new Image("chicago_bbq.png");
    Image chicagoMeatzza = new Image("chicago_meatzza.png");
    Image chicagoBYO = new Image("chicago_byo.png");

    @Override
    public void initialize(URL url, ResourceBundle rb){
        ObservableList<String> flavorList= FXCollections.observableArrayList("Deluxe", "BBQ", "Meatzza", "Build Your Own");
        flavorBox1.setItems(flavorList);

        flavorBox1.getSelectionModel().select("Build Your Own");

        ObservableList<String> size = FXCollections.observableArrayList("small", "medium", "large");
        sizeBox1.setItems(size);

        toppingsList.getItems().addAll(ChicagoView);
//        toppingsList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
//            @Override
//            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
//
//            }
//        });
    }


    @FXML
    public void deluxeFlavor(){
        //size button
        //set crust option to deep dish

        //1st list view and add remove topping buttons disabled
        //set 2nd list view to chicago deluxe toppings
        //when add pizza is clicked, create pizza.deluxe() type
        //display price

        if(flavorBox1.getSelectionModel().getSelectedItem() == "Deluxe"){
            deluxe.setCrust(Crust.DEEP_DISH);
            imageView1.setImage(chicagoDelux);
        }
        if(sizeBox1.getSelectionModel().getSelectedItem() == "small"){
            deluxe.setSize(Size.SMALL);
            priceBox.setText(String.valueOf(deluxe.price()));
        }else if(sizeBox1.getSelectionModel().getSelectedItem() == "medium"){
            deluxe.setSize(Size.MEDIUM);
            priceBox.setText(String.valueOf(deluxe.price()));
        }else if(sizeBox1.getSelectionModel().getSelectedItem() == "large"){
            deluxe.setSize(Size.LARGE);
            priceBox.setText(String.valueOf(deluxe.price()));
        }
    }
    @FXML
    public void BBQChickenFlavor(){
        //size button
        //set crust option to pan
        //1st list view and add remove topping buttons disabled
        //set 2nd list view to chicago bbqchicken toppings
        //when add pizza is clicked, create pizza.bbqchicken() type
        //display price
        if(flavorBox1.getSelectionModel().getSelectedItem() == "BBQ"){
            bbq.setCrust(Crust.PAN);
            imageView1.setImage(chicagoBBQ);

        }
        if(sizeBox1.getSelectionModel().getSelectedItem() == "small"){
            bbq.setSize(Size.SMALL);
            priceBox.setText(String.valueOf(bbq.price()));
        }else if(sizeBox1.getSelectionModel().getSelectedItem() == "medium"){
            bbq.setSize(Size.MEDIUM);
            priceBox.setText(String.valueOf(bbq.price()));
        }else if(sizeBox1.getSelectionModel().getSelectedItem() == "large"){
            bbq.setSize(Size.LARGE);
            priceBox.setText(String.valueOf(bbq.price()));
        }
    }

    @FXML
    public void meatzzaFlavor(){
        //size button
        //set crust option to stuffed
        //1st list view and add remove topping buttons disabled
        //set 2nd list view to chicago deluxe toppings
        //when add pizza is clicked, create pizza.deluxe() type
        //display price
        if(flavorBox1.getSelectionModel().getSelectedItem() == "Meatzza"){
            meatzza.setCrust(Crust.STUFFED);
            imageView1.setImage(chicagoMeatzza);

        }
        if(sizeBox1.getSelectionModel().getSelectedItem() == "small"){
            meatzza.setSize(Size.SMALL);
            priceBox.setText(String.valueOf(meatzza.price()));
        }else if(sizeBox1.getSelectionModel().getSelectedItem() == "medium"){
            meatzza.setSize(Size.MEDIUM);
            priceBox.setText(String.valueOf(meatzza.price()));
        }else if(sizeBox1.getSelectionModel().getSelectedItem() == "large"){
            meatzza.setSize(Size.LARGE);
            priceBox.setText(String.valueOf(meatzza.price()));
        }
    }
    @FXML
    public void byoFlavor(){
        //size button
        //set crust option to pan
        //1st list view shows all available toppings
        //set 2nd list view empty but changes on button click
        //when add pizza is clicked, create pizza.buildyourown() type
        //display price- increase every time topping is added
        if(flavorBox1.getSelectionModel().getSelectedItem() == "Build Your Own"){
            byo.setCrust(Crust.PAN);
            imageView1.setImage(chicagoBYO);

        }
        if(sizeBox1.getSelectionModel().getSelectedItem() == "small"){
            byo.setSize(Size.SMALL);
            priceBox.setText(String.valueOf(byo.price()));
        }else if(sizeBox1.getSelectionModel().getSelectedItem() == "medium"){
            byo.setSize(Size.MEDIUM);
            priceBox.setText(String.valueOf(byo.price()));
        }else if(sizeBox1.getSelectionModel().getSelectedItem() == "large"){
            byo.setSize(Size.LARGE);
            priceBox.setText(String.valueOf(byo.price()));
        }

    }



}
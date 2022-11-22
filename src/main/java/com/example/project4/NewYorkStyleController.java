package com.example.project4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class NewYorkStyleController implements Initializable {

    @FXML
    private ListView <String> availableToppings = new ListView<>();
    @FXML
    private ListView <String> displayToppings = new ListView<>();
    PizzaFactory pf = new NYPizza();
    Pizza deluxe = pf.createDeluxe();
    Pizza bbq = pf.createBBQChicken();
    Pizza meatzza = pf.createMeatzza();
    Pizza byo = pf.createBuildYourOwn();


    @FXML
    private ComboBox<String> sizeBox2;
    @FXML
    private TextArea priceBox2;
    @FXML
    private Button addButton;
    @FXML
    private Button removeButton;
    @FXML
    private Button addToOrderButton;
    @FXML
    private ComboBox<String> flavorBox;
    @FXML
    private ImageView imageView2;


    private Image deluxeImage = new Image(getClass().getResourceAsStream("deluxe-ny.png"));
    private Image bbqImage = new Image(getClass().getResourceAsStream("bbq-ny.png"));
    private Image meatzzaImage = new Image(getClass().getResourceAsStream("meatzza-ny.png"));
    private Image byoImage = new Image(getClass().getResourceAsStream("byo-ny.png"));

    private MainController mainController; //controller for main view

    public void setMainController(MainController mainController){
        this.mainController = mainController;
    }
    @FXML
    void selectFlavor(ActionEvent event) {
        String flavorString = flavorBox.getSelectionModel().getSelectedItem().toString();
        if(flavorString.equalsIgnoreCase("Deluxe")){
            imageView2.setImage(deluxeImage);
            addButton.setDisable(true);
            removeButton.setDisable(true);
        }
        if(flavorString.equalsIgnoreCase("BBQ")){
            imageView2.setImage(bbqImage);
            addButton.setDisable(true);
            removeButton.setDisable(true);
        }
        if(flavorString.equalsIgnoreCase("Meatzza")){
            imageView2.setImage(meatzzaImage);
            addButton.setDisable(true);
            removeButton.setDisable(true);
        }
        if(flavorString.equalsIgnoreCase("BYO")){
            imageView2.setImage(byoImage);
        }

    }

    @FXML
    void selectSize(ActionEvent event){
        String sizeString = sizeBox2.getSelectionModel().getSelectedItem().toString();
    }

//    @FXML
//    void selectToppings(ActionEvent event){
//        String toppingsString = toppingsBox1.getSelectionModel().getSelectedItem().toString();
//
//    }

    @FXML
    void addButton(MouseEvent event){
        if(availableToppings.getItems().size() >= 7){
            ButtonType ButtonType = null;
            Alert alarm = new Alert(Alert.AlertType.ERROR, "cannot exceed 7 toppings!", ButtonType);
            alarm.setHeaderText("This is the maximum number of toppings");
            alarm.show();
        }
        else{
            String availableItem = displayToppings.getSelectionModel().getSelectedItem();
            displayToppings.getItems().remove(availableItem);
            availableToppings.getItems().add(availableItem);
            String result = flavorBox.getSelectionModel().getSelectedItem();
            if(result.equals("Build Your Own")){
                byo.add(availableItem);
                priceBox2.setText(Double.toString(byo.price()));
            }
        }
    }

    @FXML
    void removeButton(MouseEvent event){
        String availableItem = availableToppings.getSelectionModel().getSelectedItem();
        availableToppings.getItems().remove(availableItem);
        displayToppings.getItems().add(availableItem);
        String result = flavorBox.getSelectionModel().getSelectedItem();
        if(result.equals("Build Your Own")){
            byo.remove(availableItem);
            priceBox2.setText(Double.toString(byo.price()));
        }
    }

    String[] NYView = {Topping.SAUSAGE.toString(), Topping.PEPPERONI.toString(), Topping.GREEN_PEPPER.toString(), Topping.ONION.toString(), Topping.MUSHROOM.toString(), Topping.BBQ_CHICKEN.toString(), Topping.PROVOLONE.toString(), Topping.CHEDDAR.toString(), Topping.BEEF.toString(), Topping.HAM.toString(), Topping.PINEAPPLE.toString(), Topping.JALAPENO.toString(), Topping.OLIVES.toString()};
    //String currentViewItem;



    @Override
    public void initialize(URL url, ResourceBundle rb){
        ObservableList<String> flavorList= FXCollections.observableArrayList("Deluxe", "BBQ", "Meatzza", "Build Your Own");
        flavorBox.setItems(flavorList);

        flavorBox.getSelectionModel().select("Build Your Own");

        ObservableList<String> size = FXCollections.observableArrayList("small", "medium", "large");
        sizeBox2.setItems(size);

        availableToppings.getItems().addAll(NYView);
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
        if(flavorBox.getSelectionModel().getSelectedItem() == "Deluxe"){
            deluxe.setCrust(Crust.BROOKLYN);
            imageView2.setImage(deluxeImage);
        }
        if(sizeBox2.getSelectionModel().getSelectedItem() == "small"){
            deluxe.setSize(Size.SMALL);
            priceBox2.setText(String.valueOf(deluxe.price()));
        }else if(sizeBox2.getSelectionModel().getSelectedItem() == "medium"){
            deluxe.setSize(Size.MEDIUM);
            priceBox2.setText(String.valueOf(deluxe.price()));
        }else if(sizeBox2.getSelectionModel().getSelectedItem() == "large"){
            deluxe.setSize(Size.LARGE);
            priceBox2.setText(String.valueOf(deluxe.price()));
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
        if(flavorBox.getSelectionModel().getSelectedItem() == "BBQ"){
            bbq.setCrust(Crust.THIN);
            imageView2.setImage(bbqImage);
        }
        if(sizeBox2.getSelectionModel().getSelectedItem() == "small"){
            bbq.setSize(Size.SMALL);
            priceBox2.setText(String.valueOf(bbq.price()));
        }else if(sizeBox2.getSelectionModel().getSelectedItem() == "medium"){
            bbq.setSize(Size.MEDIUM);
            priceBox2.setText(String.valueOf(bbq.price()));
        }else if(sizeBox2.getSelectionModel().getSelectedItem() == "large"){
            bbq.setSize(Size.LARGE);
            priceBox2.setText(String.valueOf(bbq.price()));
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
        if(flavorBox.getSelectionModel().getSelectedItem() == "Meatzza"){
            meatzza.setCrust(Crust.HAND_TOSSED);
            imageView2.setImage(meatzzaImage);
        }
        if(sizeBox2.getSelectionModel().getSelectedItem() == "small"){
            meatzza.setSize(Size.SMALL);
            priceBox2.setText(String.valueOf(meatzza.price()));
        }else if(sizeBox2.getSelectionModel().getSelectedItem() == "medium"){
            meatzza.setSize(Size.MEDIUM);
            priceBox2.setText(String.valueOf(meatzza.price()));
        }else if(sizeBox2.getSelectionModel().getSelectedItem() == "large"){
            meatzza.setSize(Size.LARGE);
            priceBox2.setText(String.valueOf(meatzza.price()));
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
        if(flavorBox.getSelectionModel().getSelectedItem() == "Build Your Own"){
            byo.setCrust(Crust.HAND_TOSSED);
            imageView2.setImage(byoImage);
        }
        if(sizeBox2.getSelectionModel().getSelectedItem() == "small"){
            byo.setSize(Size.SMALL);
            priceBox2.setText(String.valueOf(byo.price()));
        }else if(sizeBox2.getSelectionModel().getSelectedItem() == "medium"){
            byo.setSize(Size.MEDIUM);
            priceBox2.setText(String.valueOf(byo.price()));
        }else if(sizeBox2.getSelectionModel().getSelectedItem() == "large"){
            byo.setSize(Size.LARGE);
            priceBox2.setText(String.valueOf(byo.price()));
        }
    }
}

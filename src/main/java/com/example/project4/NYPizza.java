package com.example.project4;

public class NYPizza implements PizzaFactory{
    public Pizza createDeluxe(){
        //body
        Deluxe deluxePizza = new Deluxe();
        //deluxePizza.setToppings();
        deluxePizza.setCrust(Crust.BROOKLYN);
        return deluxePizza;
    }
    public Pizza createMeatzza(){
        //body
        Meatzza meatzzaPizza = new Meatzza();
        //meatzzaPizza.setToppings();
        meatzzaPizza.setCrust(Crust.THIN);
        return meatzzaPizza;
    }
    public Pizza createBBQChicken(){
        //body
        BBQChicken bbqPizza = new BBQChicken();
        //bbqPizza.setToppings();
        bbqPizza.setCrust(Crust.HAND_TOSSED);
        return bbqPizza;

    }
    public Pizza createBuildYourOwn(){
        //body
        BuildYourOwn byoPizza = new BuildYourOwn();
        byoPizza.setCrust(Crust.HAND_TOSSED);
        return byoPizza;
    }
}

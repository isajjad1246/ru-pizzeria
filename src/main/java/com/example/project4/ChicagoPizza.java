package com.example.project4;

public class ChicagoPizza implements PizzaFactory{
    public Pizza createDeluxe(){
        //body
        Deluxe deluxePizza = new Deluxe();
        deluxePizza.setCrust(Crust.DEEP_DISH);
        return deluxePizza;
    }
    public Pizza createMeatzza(){
        //body
        Meatzza meatzzaPizza = new Meatzza();
        meatzzaPizza.setCrust(Crust.PAN);
        return meatzzaPizza;
    }
    public Pizza createBBQChicken(){
        //body
        BBQChicken bbqPizza = new BBQChicken();
        bbqPizza.setCrust(Crust.STUFFED);
        return bbqPizza;
    }
    public Pizza createBuildYourOwn(){
        //body
        BuildYourOwn byoPizza = new BuildYourOwn();
        byoPizza.setCrust(Crust.PAN);
        return byoPizza;
    }

}

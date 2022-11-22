package com.example.project4;

import java.util.ArrayList;

public class Deluxe extends Pizza{

    //sets toppings
    public Deluxe(){
        getToppings().add(Topping.SAUSAGE);
        getToppings().add(Topping.PEPPERONI);
        getToppings().add(Topping.GREEN_PEPPER);
        getToppings().add(Topping.ONION);
        getToppings().add(Topping.MUSHROOM);
    }

    public double price(){
        double result = 0;
        if (getSize() == Size.SMALL){
            result = 14.99;
        }
        else if (getSize() == Size.MEDIUM){
            result = 16.99;
        }
        else{
            result = 18.99;
        }
        return (double) Math.round(result*100)/100;
    }

    //crust- figure out cuz depends on chicago or ny
}

package com.example.project4;

public class BBQChicken extends Pizza{

    public BBQChicken(){
        getToppings().add(Topping.BBQ_CHICKEN);
        getToppings().add(Topping.GREEN_PEPPER);
        getToppings().add(Topping.PROVOLONE);
        getToppings().add(Topping.CHEDDAR);
    }

    public double price(){
        double result = 0;
        if (getSize() == Size.SMALL){
            result = 13.99;
        }
        else if (getSize() == Size.MEDIUM){
            result = 15.99;
        }
        else{
            result = 17.99;
        }
        return result;
    }

}
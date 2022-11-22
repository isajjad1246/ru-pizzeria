package com.example.project4;

public class Meatzza extends Pizza{
    public Meatzza(){
        getToppings().add(Topping.SAUSAGE);
        getToppings().add(Topping.PEPPERONI);
        getToppings().add(Topping.BEEF);
        getToppings().add(Topping.HAM);
    }

     public double price(){
        double result = 0;
        if (getSize() == Size.SMALL){
            result = 15.99;
        }
        else if (getSize() == Size.MEDIUM){
            result = 17.99;
        }
        else{
            result = 19.99;
        }
         return (double) Math.round(result*100)/100;
    }
}
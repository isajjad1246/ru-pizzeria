package com.example.project4;

public class BuildYourOwn extends Pizza{
    //add toppings in controller when they are added
    public double price(){
        double result = 0;
        if (getSize() == Size.SMALL){
            result = 8.99;
        }
        else if (getSize() == Size.MEDIUM){
            result = 10.99;
        }
        else{
            result = 12.99;
        }
        return result;
    }
}

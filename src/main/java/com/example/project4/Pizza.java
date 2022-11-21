package com.example.project4;

import java.util.ArrayList;

public abstract class Pizza implements Customizable {
    private ArrayList<Topping> toppings;
    private Crust crust;
    private Size size;
    public abstract double price();

    public ArrayList getToppings(){
        return toppings;
    }
    public Crust getCrust(){
        return crust;
    }
    public void setCrust(Crust crust2){
        this.crust = crust2;
    }

    public Size getSize(){
        return size;
    }
    public void setSize(Size size1){
        this.size = size1;
    }

    public double getPrice(){
        return price();
    }

    public boolean add(Object obj){
        //write code to add topping- functions as a .add??
        //findTopping(obj);
        if (this.toppings.add(findTopping(obj)) == true){
            return true;
        }
        return false;
    }

    public boolean remove(Object obj) {
        if (this.toppings.remove(findTopping(obj)) == true){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "";
        result += "Toppings: ";
        for (int i = 0; i < toppings.size(); i++){
            result += toppings.get(i) + ", ";
        }
        result += "; Crust Type: " + crust.toString();
        result += "; Size: " + size.toString();
        return result;
    }

    //method that converts obj to topping type by comparing strings
    public Topping findTopping(Object obj){
        if (obj.equals("Sausage")){
            return Topping.SAUSAGE;
        }
        else if (obj.equals("Pepperoni")){
            return Topping.PEPPERONI;
        }
        else if (obj.equals("Green Pepper")){
            return Topping.GREEN_PEPPER;
        }
        else if (obj.equals("Onion")){
            return Topping.ONION;
        }
        else if (obj.equals("Mushroom")){
            return Topping.MUSHROOM;
        }
        else if (obj.equals("BBQ Chicken")){
            return Topping.BBQ_CHICKEN;
        }
        else if (obj.equals("Provolone")){
            return Topping.PROVOLONE;
        }
        else if (obj.equals("Cheddar")){
            return Topping.CHEDDAR;
        }
        else if (obj.equals("Beef")){
            return Topping.BEEF;
        }
        else if (obj.equals("Ham")){
            return Topping.HAM;
        }
        else if (obj.equals("Olives")){
            return Topping.OLIVES;
        }
        else{
            return Topping.JALAPENO;
        }

    }
}

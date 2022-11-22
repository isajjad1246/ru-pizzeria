package com.example.project4;
import java.util.ArrayList;
import java.util.Random;

public class Order implements Customizable{
    public int orderNumber;
    public double orderCost;
    //make arraylist of pizzas?
    public ArrayList<Pizza> pizzaOrder;
    //add and remove pizzas from arraylist using add() and remove()

    public Order(){
        Random rand = new Random();
        orderNumber = rand.nextInt(1000)+0;
        pizzaOrder = new ArrayList<Pizza>();
    }

    public void setOrderTotal(double temp){
        this.orderCost = temp;
    }

    public boolean add(Object obj){
        //add pizza to order?
        //obj is the pizza, add it to the order
        //somehow typecast obj to pizza type
        Pizza temp = (Pizza) obj;
        if (pizzaOrder.add(temp) == true){
            return true;
        }
        return false;
    }

    public boolean remove(Object obj){
        Pizza temp = (Pizza) obj;
        if (pizzaOrder.remove(temp) == true){
            return true;
        }
        return false;
    }

    public String orderToString() {
        //order number plus pizza
        String result = "";
        result += "Order Number: " + orderNumber + "\n";
        for (int i = 0; i < pizzaOrder.size(); i++){
            result += pizzaOrder.get(i).toString() + "; ";
        }
        return result;
    }

    //method for cost of order
    public double addCost(Double cost){
        orderCost += cost;
        return orderCost;
    }

    public double removeCost(Double cost){
        orderCost -= cost;
        return orderCost;
    }
}

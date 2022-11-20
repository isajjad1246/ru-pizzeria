package com.example.project4;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;

public class StoreOrders implements Customizable{

    //arraylist of order type
    public ArrayList<Order> orderList;
    public double totalCost;
    public boolean add(Object obj){
        //add order type to arraylist
        Order temp = (Order) obj;
        if (orderList.add(temp) == true){
            return true;
        }
        return false;
    }

    public boolean remove(Object obj){
        //remove order type from arraylist
        Order temp = (Order) obj;
        if (orderList.remove(temp) == true){
            return true;
        }
        return false;
    }


    //method for total cost of order
    public double addTotalCost(Double cost){
        totalCost += cost;
        return totalCost;
    }
    public double removeTotalCost(Double cost){
        totalCost -= cost;
        return totalCost;
    }

    //method to export orders to a text file
    public void export(){
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            //here write contents of arraylist
            for (int i = 0; i < orderList.size(); i++){
                myWriter.write(orderList.get(i).orderToString() + "\n");
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

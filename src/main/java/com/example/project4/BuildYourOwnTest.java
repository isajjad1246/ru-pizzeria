package com.example.project4;

import static org.junit.jupiter.api.Assertions.*;
import org.testng.annotations.Test;


class BuildYourOwnTest {

    PizzaFactory pf = new NYPizza();
    Pizza byo = pf.createBuildYourOwn();

    @Test
    public void price() {
        byo.getToppings().add(Topping.PINEAPPLE);
        byo.getToppings().add(Topping.SAUSAGE);
        byo.setSize(Size.SMALL);
        if(byo.getToppings().size() == 2){
            double expectedResult = 12.17;
            double actualResult = byo.price();
            assertEquals(expectedResult, actualResult);
        }

        byo.getToppings().add(Topping.PROVOLONE);
        byo.getToppings().add(Topping.CHEDDAR);
        byo.getToppings().add(Topping.HAM);
        byo.setSize(Size.MEDIUM);
        if(byo.getToppings().size() == 5){
            double expectedResult = 16.94;
            double actualResult = byo.price();
            assertEquals(expectedResult, actualResult);
        }

        byo.setSize(Size.LARGE);
        if(byo.getToppings().size() == 5){
            double expectedResult = 18.94;
            double actualResult = byo.price();
            assertEquals(expectedResult, actualResult);
        }
    }
}
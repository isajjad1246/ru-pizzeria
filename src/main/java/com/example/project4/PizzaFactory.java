package com.example.project4;
/**
 * @author Reiya Dave, Ifrah Sajjad
 * */


/**
 * interface class for pizza factory
 * */
public interface PizzaFactory {
    /**
     * initialized method for create deluxe pizza
     * */
    Pizza createDeluxe();

    /**
     * initialized method for create meatzza pizza
     * */
    Pizza createMeatzza();

    /**
     * initialized method for create bbq chicken pizza
     * */
    Pizza createBBQChicken();

    /**
     * initialized method for create build your own pizza
     * */
    Pizza createBuildYourOwn();
}

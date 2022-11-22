package com.example.project4;
/**
 * @author Reiya Dave, Ifrah Sajjad
 * */

public enum Size{
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");

    private final String size_type;

    /**
     * setter for size type
     * */
    private Size(String size_type){
        this.size_type = size_type;
    }
}

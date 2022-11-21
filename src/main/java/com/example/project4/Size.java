package com.example.project4;

public enum Size{
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");

    private final String size_type;

    private Size(String size_type){
        this.size_type = size_type;
    }
}

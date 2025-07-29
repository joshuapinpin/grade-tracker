package com.gradetracker.model;

public class Name{
    private String name;
    public Name(String name){
        if(name == null || name.isBlank()) throw new IllegalArgumentException("Invalid Name");
        this.name = name;
    }
    public String name(){return name;}
}
package io.zipcoder.polymorphism;

public class Bunny extends Pet {

    //Constructor
    public Bunny(String name){
        super(name);
    }

    @Override
    public String speak() {
        return "Meep!";
    }
}


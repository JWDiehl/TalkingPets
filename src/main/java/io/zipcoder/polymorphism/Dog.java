package io.zipcoder.polymorphism;

public class Dog extends Pet {


    //Constructor
    public Dog(String name){
        super(name);
    }

    @Override
    public String speak() {
        return "Bark!";
    }
}

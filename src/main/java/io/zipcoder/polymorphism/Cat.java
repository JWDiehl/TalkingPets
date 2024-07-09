package io.zipcoder.polymorphism;

public class Cat extends Pet {

    //Generate constructor
    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Meow!";
    }
}

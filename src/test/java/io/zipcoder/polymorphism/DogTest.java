package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void testCatSpeak() {

        //Given
        Dog dog = new Dog("Jimmy Page");

        //When
        String talkingPets = dog.speak();

        //Then
        Assert.assertEquals("Bark!", talkingPets);
    }

    @Test
    public void testDogGetName() {
        //Given
        String expectedName = "George Harrison";
        Dog dog = new Dog(expectedName);

        //Then
        String actualName = dog.getName();

        //When
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testDogSetName() {
        //Given
        Dog dog = new Dog("Billy Joel");
        String newName = "Ringo Starr";

        //Then
        dog.setName(newName);

        //When
        Assert.assertEquals(newName, dog.getName());

    }

    @Test
    public void testDogConstructor() {
        String name = "Maxey";
        Object dog = new Dog(name);
        Assert.assertTrue(dog instanceof Dog);
    }

    @Test
    public void testDogIsPet() {
        String name = "Maxey";
        Pet dog = new Dog(name);
        Assert.assertTrue(dog instanceof Dog);
}
}

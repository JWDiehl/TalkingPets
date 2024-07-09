package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void getName() {

        //Given
        String expectedPetName = "George";
        Pet pet = new Pet(expectedPetName);

        //When
        String actualName = pet.getName();

        //Then
        Assert.assertEquals(expectedPetName, actualName);
    }

    @Test
    public void setName() {

        //Given
        Pet pet = new Pet("Roger");
        String newName = "Stevie";

        //When
        pet.setName(newName);

        //Then
        Assert.assertEquals(newName, pet.getName());
    }

    @Test
    public void speak() {

        //Given
        Pet pet = new Pet("Paulie the Dog");

        //When
        String talkingPets = pet.speak();

        //Then
        Assert.assertEquals("Ayo im a pet!", talkingPets);
    }
}
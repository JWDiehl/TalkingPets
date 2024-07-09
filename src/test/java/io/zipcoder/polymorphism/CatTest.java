package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void testCatSpeak() {

        //Given
        Cat cat = new Cat("Ava the Cat");

        //When
        String talkingPets = cat.speak();

        //Then
        Assert.assertEquals("Meow!", talkingPets);
    }

    @Test
    public void testCatGetName() {
        //Given
        String expectedName = "Paul McCartney";
        Cat cat = new Cat(expectedName);

        //Then
        String actualName = cat.getName();

        //When
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testCatSetName() {
            //Given
            Cat cat = new Cat("Stevie Nicks");
            String newName = "Mick Jagger";

            //Then
            cat.setName(newName);

            //When
            Assert.assertEquals(newName, cat.getName());

        }

    }

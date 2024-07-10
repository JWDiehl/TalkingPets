package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BunnyTest {

    @Test
    public void testBunnyConstructor() {
        String name = "Hilary";
        Object bunny = new Bunny(name);
        Assert.assertTrue(bunny instanceof Bunny);
    }

    @Test
    public void testBunnyIsPet() {
        String name = "Maxey";
        Pet bunny = new Bunny(name);
        Assert.assertTrue(bunny instanceof Bunny);
    }

    @Test
    public void testBunnySpeak() {

        //Given
        Bunny bunny = new Bunny("Lola");

        //When
        String talkingPets = bunny.speak();

        //Then
        Assert.assertEquals("Meep!", talkingPets);
    }

    @Test
    public void testBunnyGetName() {
        //Given
        String expectedName = "Paul George";
        Bunny bunny = new Bunny(expectedName);

        //Then
        String actualName = bunny.getName();

        //When
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testBunnySetName() {
        //Given
        Bunny bunny = new Bunny("Biggie Smalls");
        String newName = "Tupac";

        //Then
        bunny.setName(newName);

        //When
        Assert.assertEquals(newName, bunny.getName());

    }

}

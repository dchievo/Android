package com.teamtreehouse.funfacts;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by dchi on 9/8/2015.
 */
public class FactBook {

// grab random fact and return it
    public String getFact()
    {
        String fact = "";
        // Randomly select a fact
        Random randomGenerator = new Random(); //Construct a new random number generator
        int randomNumber = randomGenerator.nextInt(8);
        //Convert randomNumber to text fact
        List<String> randomFact = new ArrayList<>();
        randomFact.add("Richard can go fuck himself.");
        randomFact.add("Kiet is actually Le's bro-in-law?.");
        randomFact.add("Matt should start fapping his head to grow hair.");
        randomFact.add("Richard and Kiet are besties aka butt pirates.");
        randomFact.add("Angel takes gigantic shits in your mouth all the fucking time!");
        randomFact.add("Matt should start fapping his head to grow hair.");
        randomFact.add("Richard should start fapping his head to grow hair.");
        randomFact.add("You can't think without imagining what you're reading, such as Heather scissoring Laura...");
        fact = randomFact.get(randomNumber);
        return fact;
    }
}

package com.teamtreehouse.funfacts;

import android.graphics.Color;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by dchi on 9/8/2015.
 */
public class ColorWheel {

    // grab random fact and return it
    public int mColors()
    {
        List<String> colors = Arrays.asList("#39add1", "#3079ab", "#c25975", "#e15258",
                "#f9845b", "#838cc7", "#7d669e", "#53bbb4", "#51b46d",
                "#e0ab18", "#637a91", "#f092b0", "#b7c0c7");
        // Randomly select a fact
        Random randomGenerator = new Random(); //Construct a new random number generator
        int randomNumber = randomGenerator.nextInt(13);
        int colorAsInt = Color.parseColor(colors.get(randomNumber));
        //Convert randomNumber to random color
        return colorAsInt;
    }
}
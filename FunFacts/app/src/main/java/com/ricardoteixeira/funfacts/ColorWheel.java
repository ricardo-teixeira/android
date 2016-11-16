package com.ricardoteixeira.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Ricardo on 15/11/2016.
 */

public class ColorWheel {

    public String[] mColors = {
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7"
    };

    public int getColor() {
        // Randomly select a fact
        Random randomGenerator = new Random(); // Construct new Random number generator
        int randomNumber = randomGenerator.nextInt(mColors.length);
        int color = Color.parseColor(mColors[randomNumber]);

        return color;
    }

}

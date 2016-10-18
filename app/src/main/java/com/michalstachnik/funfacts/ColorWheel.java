package com.michalstachnik.funfacts;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    private String[] mColors = {
            "#c25975",
            "#39add1",
            "#f9845b",
            "#637a91",
            "#e0ab18",
            "#51b46d"
    };

    public int getColor(){
        String color;

        Random randomGenerator = new Random();
        int randomNumber  = randomGenerator.nextInt(mColors.length);
        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;

    };
}

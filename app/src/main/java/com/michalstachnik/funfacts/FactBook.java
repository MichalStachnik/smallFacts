package com.michalstachnik.funfacts;


import java.util.Random;

public class FactBook {

    // Fields (Member Variables) - the properties of the objects
    private String[] mFacts = {

            "I'm also learning Android from home",
            "Soccer is my favorite sport",
            "I like programming because it is really intense problem solving"
    };

    // Methods - the actions the object can do
    public String getFact(){

        String fact = "";

        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }
}

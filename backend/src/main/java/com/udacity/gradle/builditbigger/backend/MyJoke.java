package com.udacity.gradle.builditbigger.backend;

import com.examples.apps.atta.javajokelib.JokeTeller;

/** The object model for the data we are sending through endpoints */
public class MyJoke {

    private JokeTeller jokeTeller;
    private String joke;


    public MyJoke() {
        jokeTeller = new JokeTeller();
    }

    public String getJoke() {
        joke = jokeTeller.getJoke();
        return joke;
    }

    public void setJoke(String data) {
        joke = data;
    }
}
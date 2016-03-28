package com.Josh;

/**
 * Created by Destro on 3/28/2016.
 */
public class NameCapitalizer implements NameProcessor {

    public void process(String name) {
        System.out.println("Here is your name in uppercase: ");
        System.out.println(name.toUpperCase());
    }
}

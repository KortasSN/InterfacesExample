package com.Josh;

/**
 * Created by Destro on 3/28/2016.
 */
public class NameExclaim implements NameProcessor {
    public void process(String name) {
        System.out.println("Here is your name with some exclamation points: ");
        System.out.println(name + "!!!!!!!!!");
    }
}

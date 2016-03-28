package com.Josh;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.lang.model.element.Name;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Created by Destro on 3/28/2016.
 */
public class NameSaver implements NameProcessor {
    public void process(String name) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("yourname.txt"));
            writer.write(name);
            writer.close();
            System.out.println("Saved name to file.");
        } catch (IOException ioe) {
            System.out.println("Sorry, couldn't save your name, this error occurred: " + ioe);
        }
    }

}

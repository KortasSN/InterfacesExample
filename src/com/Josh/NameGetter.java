package com.Josh;

import java.util.Scanner;

public class NameGetter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name please? ");
        String name = scanner.nextLine();

        NameProcessor nameProcessor = new NameExclaim();
    nameProcessor.process(name);
        System.out.println("Thank you, I have processed your name");
    }
}

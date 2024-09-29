package com.goa;
/*
 * Goa Legislative Assembly implementation using OOPs concepts
 * @author Omkar Mhamal
 * 
 */

public class Speaker extends Person {

    public Speaker(String name) {
        super(name);
    }

    public Speaker(Speaker other) {
        super(other);
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is the Speaker of the Goa Legislative Assembly.");
    }

    @Override
    public String toString() {
        return name;
    }
}

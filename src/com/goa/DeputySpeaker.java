package com.goa;
/*
 * Goa Legislative Assembly implementation using OOPs concepts
 * @author Omkar Mhamal
 * 
 */

public class DeputySpeaker extends Speaker {

    public DeputySpeaker(String name) {
        super(name);
    }

    public DeputySpeaker(DeputySpeaker other) {
        super(other);
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is the Deputy Speaker of the Goa Legislative Assembly.");
    }
}

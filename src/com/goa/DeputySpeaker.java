package com.goa;

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

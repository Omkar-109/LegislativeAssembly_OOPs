package com.goa;
/*
 * Goa Legislative Assembly implementation using OOPs concepts
 * @author Omkar Mhamal
 * 
 */

public class ChiefMinister extends Person {
    private String party;

    public ChiefMinister(String name, String party) {
        super(name);
        this.party = party;
    }

    public ChiefMinister(ChiefMinister other) {
        super(other);
        this.party = other.party;
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is the Chief Minister of Goa, from party " + party);
    }

    @Override
    public String toString() {
        return name + " (" + party + ")";
    }
}

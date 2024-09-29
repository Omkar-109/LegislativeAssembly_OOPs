package com.goa;
/*
 * Goa Legislative Assembly implementation using OOPs concepts
 * @author Omkar Mhamal
 * 
 */

public abstract class Member extends Person {
    protected String constituency;
    protected String party;
    protected boolean isReservedSeat;

    public Member(String name, String constituency, String party, boolean isReservedSeat) {
        super(name);
        this.constituency = constituency;
        this.party = party;
        this.isReservedSeat = isReservedSeat;
    }

    public Member(Member other) {
        super(other);
        this.constituency = other.constituency;
        this.party = other.party;
        this.isReservedSeat = other.isReservedSeat;
    }

    public String getConstituency() {
        return constituency;
    }

    public void setConstituency(String constituency) {
        this.constituency = constituency;
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Member of the Goa Legislative Assembly.");
    }

    @Override
    public String toString() {
        return name + " (" + party + ")";
    }
}

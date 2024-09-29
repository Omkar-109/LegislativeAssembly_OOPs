package com.goa;

public class LegislativeMember extends Member {

    public LegislativeMember(String name, String constituency, String party, boolean isReservedSeat) {
        super(name, constituency, party, isReservedSeat);
    }

    public LegislativeMember(LegislativeMember other) {
        super(other);
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Legislative Member representing " + constituency);
    }
}

package com.goa;
/*
 * Goa Legislative Assembly implementation using OOPs concepts
 * @author Omkar Mhamal
 * 
 */

public class Committee {
    public enum CommitteeType {
        STANDING, AD_HOC
    }

    private String name;
    private CommitteeType type;

    public Committee(String name, CommitteeType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public CommitteeType getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + " (" + type + ")";
    }
}

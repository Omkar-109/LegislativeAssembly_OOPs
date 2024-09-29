package com.goa;
/*
 * Goa Legislative Assembly implementation using OOPs concepts
 * @author Omkar Mhamal
 * 
 */

public class Bill {
    private String title;
    private String description;

    public Bill(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return title;
    }
}

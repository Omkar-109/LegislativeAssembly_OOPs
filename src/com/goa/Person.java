package com.goa;

public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(Person other) {
        this.name = other.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void displayRole(); // Virtual/Abstract method for polymorphism
}

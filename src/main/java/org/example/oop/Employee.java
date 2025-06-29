package org.example.oop;

public abstract class Employee {
    public String name;

    abstract public String setName(String name);

    public String getName(){
        return this.name;
    }
}

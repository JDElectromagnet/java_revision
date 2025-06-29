package org.example.oop;

public class Salary extends Employee {

    public void hello(){
        System.out.println("Hello");
    }

    public String setName( String name){
        this.name = name;
        System.out.println(this.getName());
        return this.name;
    }
}

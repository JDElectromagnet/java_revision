package org.example;


public class Main {
    public static void main(String[] args) {


        LoopClass object1 = new LoopClass();

        System.out.println("---");
        object1.forloop();

        System.out.println("---");
        object1.forloop_tables(2,20);

        System.out.println("---");
        object1.whileloop(10);

        System.out.println("Hello There!");
    }
}

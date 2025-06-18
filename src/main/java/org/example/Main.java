package org.example;


import org.example.oop.Vehicle;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello There! Welcome to JAVA CONSOLE by Juned");

        LoopClass object1 = new LoopClass();

        System.out.println("---");
        object1.forloop();

        System.out.println("---");
        object1.forloop_tables(2,20);

        System.out.println("---");
        object1.whileloop(1);


        DataTypeClass object2 = new DataTypeClass();

        object2.show();

        System.out.println("---");

        Vehicle object3 = new Vehicle();
        object3.setName("Toyota");
        object3.setColor("red");
        object3.setVehicleType("Car");
        object3.setTransmissionType("Auto");


        System.out.println(object3.toString());



    }
}


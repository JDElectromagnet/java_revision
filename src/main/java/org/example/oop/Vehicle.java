package org.example.oop;

import java.math.BigInteger;

public class Vehicle {
    private String name;
    private String vehicleType;
    private String transmissionType;
    private String color;

    public Vehicle(){
        System.out.println("Vehicle Class");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleType(){
        return this.vehicleType;
    }

    public void setVehicleType(String vehicleType){
        this.vehicleType = vehicleType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "Name: "+this.getName();
    }


}

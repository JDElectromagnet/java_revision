package org.example.oop;

public interface Notification {

    default public String sendNotification(String message){
        return "e";
    }

    public String sendSMS(String message);

}

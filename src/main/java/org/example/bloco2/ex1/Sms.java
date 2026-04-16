package org.example.bloco2.ex1;

public class Sms implements Notification{
    @Override
    public void send(String msg) {
        System.out.println("sms: " + msg);
    }
}

package org.example.bloco2.ex1;

public class Push implements Notification{
    @Override
    public void send(String msg) {
        System.out.println("Push: " + msg);
    }
}

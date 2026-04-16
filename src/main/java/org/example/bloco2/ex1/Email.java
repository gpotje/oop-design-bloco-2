package org.example.bloco2.ex1;

public class Email implements Notification{
    @Override
    public void send(String msg) {
        System.out.println("Email: " + msg);
    }
}

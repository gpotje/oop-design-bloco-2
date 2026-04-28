package org.example.bloco2.ex20;

public class Email implements Sender{
    @Override
    public void send() {
        System.out.println("Sending... Email ");
    }
}

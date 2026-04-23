package org.example.bloco2.ex11_1;

public class SmsSender implements Sender{
    @Override
    public void send() {
        System.out.println("Sending SMS");
    }
}

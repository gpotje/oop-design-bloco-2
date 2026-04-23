package org.example.bloco2.ex11_1;

public class EmailSender implements Sender{
    @Override
    public void send() {
        System.out.println("Sending email");
    }
}

package org.example.bloco2.ex12;

public class SendeSms extends Sender{
    @Override
    protected void beforeProcess(){
        System.out.println("sending SMS");
    }


}

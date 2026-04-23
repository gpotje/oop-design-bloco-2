package org.example.bloco2.ex12;

public class SendeEmail extends Sender{
    @Override
    protected void beforeProcess(){
        System.out.println("configure email");
    }
    protected void afterProcess(){
        System.out.println("sending email");
    }

}

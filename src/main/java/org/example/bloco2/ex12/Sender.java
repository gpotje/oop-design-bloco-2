package org.example.bloco2.ex12;

abstract class Sender {
    public void send(){
        System.out.println("Start");
        beforeProcess();
        System.out.println("Processing");
        afterProcess();
        System.out.println("End");
    }

    protected void beforeProcess(){

    }
    protected void afterProcess(){

    }
}

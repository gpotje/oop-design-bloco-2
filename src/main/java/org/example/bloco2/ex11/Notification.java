package org.example.bloco2.ex11;

abstract class Notification {

    public void send() {

        System.out.println("Preparing...");
        notification();
        log();
        System.out.println("Done");
    }

    protected void log(){

    }
    protected abstract void notification();
}

package org.example.bloco2.ex20;

abstract class NotificationService {
    private Formatter formatter;
    private Sender sender;

    public NotificationService(Formatter formatter,Sender sender){
        this.formatter = formatter;
        this.sender = sender;
    }

    public void send() {

        System.out.println("Start");

        formatter.format();
        log();
        sender.send();

        System.out.println("End");
    }

    public void log(){

    }
}

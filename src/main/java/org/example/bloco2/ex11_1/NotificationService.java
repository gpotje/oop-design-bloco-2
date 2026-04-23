package org.example.bloco2.ex11_1;

abstract class NotificationService {
    protected Sender sender;
    public NotificationService(Sender sender){
        this.sender = sender;
    }
    public void send() {
        System.out.println("Preparing...");
        log();           // hook
        sender.send();   // strategy
        System.out.println("Done");
    }
    protected void log() {
        // hook opcional
    }
}

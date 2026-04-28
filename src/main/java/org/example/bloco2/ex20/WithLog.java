package org.example.bloco2.ex20;

public class WithLog extends NotificationService{
    public WithLog(Formatter formatter, Sender sender) {
        super(formatter, sender);
    }

    @Override
    public void log(){
        System.out.println("log...");

    }
}

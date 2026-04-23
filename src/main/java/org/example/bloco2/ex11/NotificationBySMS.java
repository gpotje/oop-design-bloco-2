package org.example.bloco2.ex11;

public class NotificationBySMS extends Notification{
    @Override
    protected void notification() {
        System.out.println("Sending SMS");
    }

    @Override
    protected void log() {
        System.out.println("========== SENDING... SMS =======");
        System.out.println("========== SMS DONE =======");
    }
}

package org.example.bloco2.ex11;

public class NotificationByEmail extends Notification{
    @Override
    protected void notification() {
        System.out.println("Sending email");
    }
}

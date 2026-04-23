package org.example.bloco2.ex11;

import org.example.bloco2.ex1.Email;

public class Principal {
    public static void main(String[] args) {
        Notification email = new NotificationByEmail();
        Notification sms = new NotificationBySMS();

        email.send();
        sms.send();
    }
}

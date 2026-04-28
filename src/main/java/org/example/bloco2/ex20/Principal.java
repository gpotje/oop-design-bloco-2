package org.example.bloco2.ex20;

public class Principal {
    public static void main(String[] args) {
        Formatter formatter = new Csv();
        Sender sender = new Email();

        NotificationService s1 = new WithLog(formatter,sender);
        NotificationService s2 = new WithOutLog(formatter,sender);

        s1.send();
        s2.send();
    }
}

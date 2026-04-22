package org.example.bloco2.ex10;

public class Principal {
    public static void main(String[] args) {
        Payment credit = new Credit();
        Payment debit = new Debit();

        PaymentService s1 = new DefaultPaymentService(credit);
        PaymentService s2 = new DefaultPaymentService(debit);

        s1.process();
        s2.process();
    }
}

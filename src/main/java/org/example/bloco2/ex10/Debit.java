package org.example.bloco2.ex10;

public class Debit implements Payment{
    @Override
    public void payment() {
        System.out.println("Debit payment");
    }
}

package org.example.bloco2.ex10;

public class Credit implements Payment{
    @Override
    public void payment() {
        System.out.println("Credit payment");
    }
}

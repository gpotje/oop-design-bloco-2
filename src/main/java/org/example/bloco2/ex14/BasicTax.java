package org.example.bloco2.ex14;

public class BasicTax implements Tax{
    @Override
    public double tax(double price) {
        return price * 0.2;
    }
}

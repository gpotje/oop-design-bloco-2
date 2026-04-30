package org.example.bloco2.projeto_1;

public class DefaultTax implements Tax{
    @Override
    public double tax(double price) {
        return price * 0.10;
    }
}

package org.example.bloco2.projeto_1;

public class DefaultShipping implements Shipping{
    @Override
    public double shipping(double price) {
        return 20;
    }
}

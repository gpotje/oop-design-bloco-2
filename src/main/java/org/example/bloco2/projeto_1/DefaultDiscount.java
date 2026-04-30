package org.example.bloco2.projeto_1;

public class DefaultDiscount implements Discount{
    @Override
    public double calculate(double price) {
        return price * 0.1;
    }
}

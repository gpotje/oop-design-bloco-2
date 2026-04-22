package org.example.bloco2.ex9;

public class BasicDiscount implements Discount{

    @Override
    public double discount(double price) {
        return price * 0.1;
    }
}

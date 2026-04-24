package org.example.bloco2.ex15;

import org.example.bloco2.ex15.Discount;

public class BasicDiscount implements Discount {
    @Override
    public double discount(double price) {
        return price * 0.1;
    }
}

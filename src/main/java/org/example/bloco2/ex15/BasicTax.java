package org.example.bloco2.ex15;

import org.example.bloco2.ex15.Tax;

public class BasicTax implements Tax {
    @Override
    public double tax(double price) {
        return price * 0.2;
    }
}

package org.example.bloco2.ex5;

public class BasicTax implements Tax{
    @Override
    public double calculate(double price) {
        return price * 0.1;
    }
}

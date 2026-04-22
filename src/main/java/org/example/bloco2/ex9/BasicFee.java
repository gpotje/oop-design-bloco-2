package org.example.bloco2.ex9;

public class BasicFee implements Fee{
    @Override
    public double fee(double price) {
        return price * 0.05;
    }
}

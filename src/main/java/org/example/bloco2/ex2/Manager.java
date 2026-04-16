package org.example.bloco2.ex2;

public class Manager implements Bonus{
    @Override
    public double calculate(double salary) {
        return salary * 0.2;
    }
}

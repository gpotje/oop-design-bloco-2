package org.example.bloco2.ex3;

public class Upper implements Text{
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}

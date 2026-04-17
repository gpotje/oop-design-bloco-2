package org.example.bloco2.ex3;

public class Lower implements Text{
    @Override
    public String format(String text) {
        return text.toLowerCase();
    }
}

package org.example.bloco2.ex7;

import java.text.Normalizer;

abstract class Format {

    public void generate() {
        System.out.println("Fetching data...");
        format();
        System.out.println("Exporting...");
    }

    protected  abstract void format();
}

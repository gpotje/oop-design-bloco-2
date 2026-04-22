package org.example.bloco2.ex7;

import java.text.Normalizer;

public class Principal {
    public static void main(String[] args) {
        Format pdf = new Pdf();
        Format csv = new Csv();

        pdf.generate();
        csv.generate();
    }
}

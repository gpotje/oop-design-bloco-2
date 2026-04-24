package org.example.bloco2.ex13;

public class Prinicipal {
    public static void main(String[] args) {
        Export csv = new Csv();
        Export pdf = new Pdf();

        ExportService s1 = new ExportWithLog(csv);
        ExportService s2 = new ExportWithOutLog(pdf);

        s1.export();
        s2.export();
    }
}

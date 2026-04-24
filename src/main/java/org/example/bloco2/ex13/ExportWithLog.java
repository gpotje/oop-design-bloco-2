package org.example.bloco2.ex13;

public class ExportWithLog extends ExportService{
    public ExportWithLog(Export export) {
        super(export);
    }
    @Override
    protected void log(){
        System.out.println("begging to log");
        System.out.println("==================");
        System.out.println("finishing to log");
    }
}

package org.example.bloco2.ex13;

abstract class ExportService {
    private Export export;

    public ExportService(Export export){
        this.export = export;
    }
    public void export() {

        System.out.println("Preparing data...");
        log();
        export.export();

        System.out.println("Finished");
    }

    protected void log(){

    }
}

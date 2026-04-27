package org.example.bloco2.ex17;

abstract class ReportService {
    private Fetch fetch;
    private Export export;

    public ReportService(Fetch fetch,Export export){
        this.export = export;
        this.fetch = fetch;
    }

    public void createReport(){
        System.out.println("start");
        fetch.fetch();
        System.out.println("format");
        export.export();
        System.out.println("End");
    }
}

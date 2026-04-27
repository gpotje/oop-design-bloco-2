package org.example.bloco2.ex17;

public class Principal {
    public static void main(String[] args) {
        Fetch fetch = new DefaultFetch();
        Export export = new Csv();

        ReportService service = new DefaultReportService(fetch,export);
        service.createReport();
    }
}

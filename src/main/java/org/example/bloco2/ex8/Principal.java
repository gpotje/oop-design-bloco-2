package org.example.bloco2.ex8;

public class Principal {
    public static void main(String[] args) {
        Task db = new TaskDb();
        Task feature = new TaskFeature();

        db.execute();
        feature.execute();
    }
}

package org.example.bloco2.ex18;

public class Principal {
    public static void main(String[] args) {
        Job dev = new Dev();
        JobService service = new DefaultJobService(dev);

        service.run();
    }
}

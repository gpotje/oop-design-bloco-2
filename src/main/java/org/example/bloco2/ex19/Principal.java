package org.example.bloco2.ex19;

public class Principal {
    public static void main(String[] args) {
        Process defaultProcess = new DefalutProcess();
        ProcessService withValidation = new WithValidation(defaultProcess);
        ProcessService withOutValidation = new WithOutValidation(defaultProcess);

        withValidation.run();
        withOutValidation.run();
    }
}

package org.example.bloco2.ex8;

abstract class Task {
    public void execute() {
        System.out.println("Start");
        hook();
        System.out.println("Processing...");
        System.out.println("End");
    }

    protected void hook(){

    }
}

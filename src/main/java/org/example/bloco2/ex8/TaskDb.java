package org.example.bloco2.ex8;

public class TaskDb extends Task{
    @Override
    protected void hook(){
        System.out.println("DB setup done");
    }
}

package org.example.bloco2.ex19;

abstract class ProcessService {

    private Process process;

    public ProcessService(Process process){
        this.process = process;
    }

    public void run(){
        System.out.println("Start");
        validate();
        process.process();
        save();
        System.out.println("End");
    }

    protected void save(){
        System.out.println("saved");
    }

    protected void validate(){

    }
}

package org.example.bloco2.ex18;

abstract class JobService {
    private Job job;

    public JobService(Job job){
        this.job = job;
    }

    public void run() {
        System.out.println("Start");
        debug();
        job.job();
        System.out.println("End");
    }

    protected void debug(){

    }
}

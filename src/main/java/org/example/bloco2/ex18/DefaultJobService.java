package org.example.bloco2.ex18;

public class DefaultJobService extends JobService{
    public DefaultJobService(Job job) {
        super(job);
    }
    @Override
    protected void debug(){
        System.out.println("Debug mode...");
    }
}

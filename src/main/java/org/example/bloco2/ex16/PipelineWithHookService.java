package org.example.bloco2.ex16;

public class PipelineWithHookService extends PipelineService{


    public PipelineWithHookService(Processor processor) {
        super(processor);
    }

    @Override
    protected void before() {
        System.out.println("BEFORE PROCESS...");
    }
    @Override
    protected void after() {
        System.out.println("AFTER PROCESS...");
    }
}
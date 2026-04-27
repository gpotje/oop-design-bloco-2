package org.example.bloco2.ex16;

abstract class PipelineService {
    private Processor processor;

    public PipelineService(Processor processor) {
        this.processor = processor;
    }

    public void run() {
        System.out.println("Start");
        before();
        processor.process();
        after();
        System.out.println("End");
    }

    protected void before() {

    }

    protected void after() {

    }
}
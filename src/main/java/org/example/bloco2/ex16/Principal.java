package org.example.bloco2.ex16;

public class Principal {
    public static void main(String[] args) {
        Processor processor = new BasicProcess();
        PipelineService s1 = new PipelineWithHookService(processor);
        PipelineService s2 = new PipelineWithOutHookService(processor);

        s1.run();
        s2.run();
    }
}

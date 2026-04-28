package org.example.bloco2.ex19;

public class WithValidation extends ProcessService{
    public WithValidation(Process process) {
        super(process);
    }
    @Override
    protected void validate(){
        System.out.println("With validation");
    }
}

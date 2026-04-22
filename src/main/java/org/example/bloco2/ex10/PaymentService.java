package org.example.bloco2.ex10;

abstract class PaymentService {

    private Payment payment ;

    public PaymentService(Payment payment){
        this.payment = payment;
    }
    public void process(){
        System.out.println("Start");
        pay();
        System.out.println("End");
    }

    protected void pay(){
        payment.payment();
    }
}

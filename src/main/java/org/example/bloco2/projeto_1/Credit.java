package org.example.bloco2.projeto_1;

public class Credit implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment with Credit");
    }
}

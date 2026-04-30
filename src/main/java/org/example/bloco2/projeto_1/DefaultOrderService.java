package org.example.bloco2.projeto_1;

public class DefaultOrderService extends OrderService{

    public DefaultOrderService(Discount discount, Payment payment, Shipping shipping, Tax tax) {
        super(discount, payment, shipping, tax);
    }
}

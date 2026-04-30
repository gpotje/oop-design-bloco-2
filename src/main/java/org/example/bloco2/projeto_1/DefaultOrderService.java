package org.example.bloco2.projeto_1;

public class DefaultOrderService extends OrderService{
    public DefaultOrderService(Discount discount, Payment payment, Shipping shipping) {
        super(discount, payment, shipping);
    }
}

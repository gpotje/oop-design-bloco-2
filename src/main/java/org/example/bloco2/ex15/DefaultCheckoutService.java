package org.example.bloco2.ex15;

public class DefaultCheckoutService extends CheckoutService{
    public DefaultCheckoutService(Discount discount, Tax tax) {
        super(discount, tax);
    }
}

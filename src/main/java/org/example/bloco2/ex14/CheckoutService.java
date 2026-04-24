package org.example.bloco2.ex14;

public class CheckoutService {
    private Discount discount;
    private Tax tax;
    private Shipping shipping;

    public CheckoutService(Discount discount,Tax tax,Shipping shipping){
        this.discount = discount;
        this.shipping = shipping;
        this.tax = tax;
    }

    public double calculate(double price) {
        return price - discount.discount(price) + tax.tax(price) + shipping.shipping();
    }
}

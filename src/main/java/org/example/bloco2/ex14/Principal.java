package org.example.bloco2.ex14;

public class Principal {
    public static void main(String[] args) {
        Discount discount = new BasicDiscount();
        Tax tax = new BasicTax();
        Shipping shipping = new BasicShipping();

        CheckoutService service = new CheckoutService(discount,tax,shipping);
        System.out.println(service.calculate(1000.0));
    }
}

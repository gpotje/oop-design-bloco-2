package org.example.bloco2.ex15;



public class Principal {
    public static void main(String[] args) {
        Discount discount = new BasicDiscount();
        Tax tax = new BasicTax();

        CheckoutService service = new DefaultCheckoutService(discount,tax);
        service.calculate(1000.0);
    }
}

package org.example.bloco2.ex5;

public class Principal {
    public static void main(String[] args) {
        Shipping shipping = new BasicShipping();
        Tax tax = new BasicTax();

        OrderService service = new OrderService(shipping,tax);

        System.out.println(service.calculate(1000.0));
    }
}

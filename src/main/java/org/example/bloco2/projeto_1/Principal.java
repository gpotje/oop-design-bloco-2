package org.example.bloco2.projeto_1;

public class Principal {
    public static void main(String[] args) {
        Payment payment = new Credit();
        Shipping shipping = new DefaultShipping();
        Discount discount = new DefaultDiscount();

        OrderService s1 = new DefaultOrderService(discount,payment,shipping);
        s1.checkout(1000.0);


        System.out.println();

        OrderService s2 = new CustomOrderService(discount,payment,shipping);
        s2.checkout(1000.0);
    }
}

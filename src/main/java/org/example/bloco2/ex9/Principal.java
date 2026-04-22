package org.example.bloco2.ex9;

public class Principal {
    public static void main(String[] args) {
        Discount discount = new BasicDiscount();
        Fee fee = new BasicFee();

        PriceService service = new PriceService(discount,fee);
        System.out.println(service.calculate(1000.0));
    }
}

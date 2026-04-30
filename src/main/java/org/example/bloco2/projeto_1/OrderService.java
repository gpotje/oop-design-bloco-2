package org.example.bloco2.projeto_1;

abstract class OrderService {
    private Discount discount;
    private Payment payment;
    private Shipping shipping;
    private Tax tax;

    public OrderService(Discount discount,Payment payment,Shipping shipping,Tax tax){
        this.discount = discount;
        this.payment = payment;
        this.shipping = shipping;
        this.tax = tax;
    }

    public void checkout(double price) {
        System.out.println("Start");
        double total = price;
        validate(price);
        total -= discount.calculate(price);
        total -= tax.tax(price);
        total += shipping.shipping(price);
        payment.pay();
        log(total);
        System.out.println("End");
    }

    protected void validate(double price){

    }

    protected void log(double total){

    }

}

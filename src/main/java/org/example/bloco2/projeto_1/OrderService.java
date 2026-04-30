package org.example.bloco2.projeto_1;

abstract class OrderService {
    private Discount discount;
    private Payment payment;
    private Shipping shipping;

    public OrderService(Discount discount,Payment payment,Shipping shipping){
        this.discount = discount;
        this.payment = payment;
        this.shipping = shipping;
    }

    public void checkout(double price) {
        System.out.println("Start");
        double total = price;
        validate(price);
        total -= discount.discountCal(price);
        total += shipping.shipping(price);
        payment.payment();
        log(total);
        System.out.println("End");
    }

    protected void validate(double price){

    }

    protected void log(double total){

    }

}
